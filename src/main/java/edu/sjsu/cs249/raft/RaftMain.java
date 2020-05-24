package edu.sjsu.cs249.raft;

import java.io.IOException;
import java.net.InetSocketAddress;

import java.nio.file.Files;
import java.nio.file.Paths;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import java.sql.*;

import edu.sjsu.cs249.raft.Election;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class RaftMain extends RaftServerGrpc.RaftServerImplBase {
	private Server server;
	private static final boolean LOG_LEADER = true;
	private AtomicLong term = new AtomicLong();
	private int candidateId;
	private long lastLogIndex = 0;
	private long lastLogTerm = 0;
	private int leaderId;
	private long prevLogIndex;
	private long prevLogTerm;
	private Role currentState = Role.FOLLOWER;
	public static long DEFAULT_LEADER_TIMEOUT = 5000L;
	public static long DEFAULT_ELECTION_TIMEOUT = 5000L;
	public static long PING_LOOP = 1000L;
	public static long DEFAULT_STALE_MEMBER_TIMEOUT = DEFAULT_LEADER_TIMEOUT;
	private Election election;
	protected long votedForTerm = -1;
	private long leaderTimestamp = System.currentTimeMillis();
	private long leaderTimeout = DEFAULT_LEADER_TIMEOUT;
	private long electionTime = -1L;
	private long electionEnd = -1L;
	private Random random = new Random();
	private long electionTimeout;
	private final Timer timerQueue = new Timer(true);
	private long leaderHeartbeatTimeout;
	public int myCandidateID = 8;
	private Connection conn = null;
	private Statement st = null;
	private ResultSet result = null;

	public class Term {

		private AtomicLong term = new AtomicLong();

		public long getCurrent() {
			return term.get();
		}

		public void setCurrent(long term) {
			this.term.set(term);
		}

		public long newTerm() {
			setCurrent(this.term.incrementAndGet());
			return getCurrent();
		}

	}

	Map<String, RaftServerGrpc.RaftServerBlockingStub> stubDictionary = new HashMap<>();

	public RaftMain(int port) throws IOException, InterruptedException {
		this.server = ServerBuilder.forPort(port).addService(this).build();

		List<String> peers = getPeers();
		List<String> nodes = getNodes();

		for (int i = 0; i < peers.size(); i++) {
			stubDictionary.put(nodes.get(i), getStub(peers.get(i).trim()));
		}
		server.start();
	}

	public RaftMain() {

	}

	private RaftServerGrpc.RaftServerBlockingStub getStub(String peer) throws InterruptedException {

		InetSocketAddress addr = str2addr(new String(peer).split("\n")[0]);
		ManagedChannel channel = ManagedChannelBuilder.forAddress(addr.getHostName(), addr.getPort()).usePlaintext()
				.build();
		return RaftServerGrpc.newBlockingStub(channel);
	}

	private static InetSocketAddress str2addr(String addr) {
		int colon = addr.lastIndexOf(':');
		return new InetSocketAddress(addr.substring(0, colon), Integer.parseInt(addr.substring(colon + 1)));
	}

	private static ExecutorService executorService = Executors.newFixedThreadPool(5);
	private AtomicInteger counter = new AtomicInteger(3);

	public class Broadcast implements Runnable {

		int i;
		RaftServerGrpc.RaftServerBlockingStub stub;

		public Broadcast(RaftServerGrpc.RaftServerBlockingStub stub) {
			this.stub = stub;
			// this.i = i;
		}

		@Override
		public void run() {
			long currentTerm = term.incrementAndGet();
			candidateId = myCandidateID;
			lastLogIndex = 0;
			lastLogTerm = 0;
			RequestVoteResponse response = stub.requestVote(RequestVoteRequest.newBuilder().setTerm(currentTerm)
					.setCadidateId(candidateId).setLastLogTerm(lastLogTerm).setLastLogIndex(lastLogIndex).build());
			System.out.println("ThreadName: " + Thread.currentThread().getName() + " " + i + stub);

			if (response.getVoteGranted()) {
				counter.getAndDecrement();
			}
		}
	}

	private void broadcastMain() throws InterruptedException {
		for (Map.Entry stubElement : stubDictionary.entrySet()) {
			String key = (String) stubElement.getKey();
			RaftServerGrpc.RaftServerBlockingStub stub = (RaftServerGrpc.RaftServerBlockingStub) stubElement.getValue();
			Broadcast task = new Broadcast(stub);
			executorService.submit(task);
		}

//		while (counter.get() > 0) {
//		}
	}

	public void setElectionTime(long electionTime) {
		this.electionTime = electionTime;
	}

//	public void leaderElection(RequestVoteRequest request, StreamObserver<RequestVoteResponse> responseObserver) {
//		long time = System.currentTimeMillis();
//		if (electionTime <= time) {
//			setElectionTime(-1);
//			long currentTerm = term.incrementAndGet();
//			this.election = new Election(6, currentTerm);
//			List<String> members = getPeers();
//			List<String> nodes = getNodes();
//			for (int i = 0; i < members.size(); i++) {
//				
//				RaftServerGrpc.RaftServerBlockingStub stub = null;
//				
//			}
//
//		}
//	}
	public void voteReceived(VoteGranted vote) {

		if (getRole() != Role.CANDIDATE) {
			return;
		}
		if (vote.getTerm() == getCurrent()) {
			election.incrementVotes();
			if (election.hasWon()) {
				election = null;
				changeRole(Role.LEADER);

			}
		} else {

		}
	}

//	private void initLeader() {
//		List<ClusterMember> members = getPeers();
//		for (ClusterMember m : members) {
//			m.setNextIndex(lastLogIndex);
//			m.setMatchIndex(0L);
//			m.setLastcommandReceived(System.currentTimeMillis());
//		}
//		
//	}
	@Override
	public void requestVote(RequestVoteRequest request, StreamObserver<RequestVoteResponse> responseObserver) {
		// TODO Auto-generated method stub
		long time = System.currentTimeMillis();
		if (electionTime <= time) {
			setElectionTime(-1);
			long currentTerm = term.incrementAndGet();
			this.election = new Election(6, currentTerm);
			List<String> members = getPeers();
			List<String> nodes = getNodes();
			for (int i = 0; i < members.size(); i++) {

				RaftServerGrpc.RaftServerBlockingStub stub = null;

			}

		}
	}

	public long getCurrent() {
		return term.get();
	}

	public void setCurrent(long term) {
		this.term.set(term);
	}

	public long newTerm() {
		setCurrent(this.term.incrementAndGet());
		return getCurrent();
	}

	public Role getRole() {
		return currentState;
	}

	void setFollower() {
		setLeaderTimestamp(System.currentTimeMillis());
		electionEnd = -1L;
		setElectionTime(-1L);
		election = null;
		changeRole(Role.FOLLOWER);
	}

	public void setLeaderTimestamp(long time) {
		this.leaderTimestamp = time;

	}

	void changeRole(Role role) {

		this.currentState = role;
	}

	public boolean vote(ClusterMember clusterMember, RequestVoteRequest vote) {
		long currentTerm = getCurrent();
		if (vote.getTerm() > currentTerm) {
			setCurrent(vote.getTerm());
			if (getRole() != Role.FOLLOWER) {
				setFollower();
			}
		}
		if (vote.getTerm() < currentTerm) {

			return false;
		}
		if (votedForTerm >= vote.getTerm()) {

			return false;
		}
		if (vote.getLastLogTerm() < lastLogTerm)// getLog().getLastTerm())
		{

			return false;
		}
		if (vote.getLastLogIndex() < lastLogIndex)// getLog().getLastIndex())
		{

			return false;
		}
		this.votedForTerm = vote.getTerm();

		return true;
	}

	@Override
	public void appendEntries(AppendEntriesRequest request, StreamObserver<AppendEntriesResponse> responseObserver) {
		try {
			conn = ConnectionManager.getConnection();
			String query = "insert into raft (term,decree, lastvote,index)" + " values (?, ?, ?,?)";
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			preparedStmt.setLong(1, request.getTerm());
			preparedStmt.setString(2, request.getEntry().getDecree());
			preparedStmt.setInt(3, request.getLeaderId());
			preparedStmt.setLong(3, request.getEntry().getIndex());
			preparedStmt.execute();

			System.out.println("Data written successfully!");
			conn.close();
		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}
		AppendEntriesResponse rsp1 = AppendEntriesResponse.newBuilder().setSuccess(true).setTerm(getCurrent()).build();
		responseObserver.onNext(rsp1);
		responseObserver.onCompleted();
	}

	@Override
	public void clientAppend(ClientAppendRequest request, StreamObserver<ClientAppendResponse> responseObserver) {
		if (currentState == Role.LEADER) {

		}

	}

	@Override
	public void clientRequestIndex(ClientRequestIndexRequest request,
			StreamObserver<ClientRequestIndexResponse> responseObserver) {

		if (currentState == Role.LEADER) {
			try {
				conn = ConnectionManager.getConnection();
				st = conn.createStatement();
				String query = "select decree,index from Raft.raft where index = '" + request.getIndex() + "'";
				// System.out.println(System.currentTimeMillis());
				result = st.executeQuery(query);
				if (result != null) {
					while (result.next()) {
						ClientRequestIndexResponse rsp = ClientRequestIndexResponse.newBuilder().setRc(0)
								.setLeader(leaderId).setIndex(result.getLong("index"))
								.setDecree(result.getString("decree")).build();
						responseObserver.onNext(rsp);

					}
				}

				else {
					ClientRequestIndexResponse rsp = ClientRequestIndexResponse.newBuilder().setRc(0)
							.setLeader(leaderId).setIndex(result.getLong(0)).setDecree(result.getString("")).build();
					responseObserver.onNext(rsp);
				}

				result.close();

				responseObserver.onCompleted();

			} catch (Exception e) {
				System.err.println("Got an exception! ");
				System.err.println(e.getMessage());
			} finally {

			}
		} else {
			ClientRequestIndexResponse rsp = ClientRequestIndexResponse.newBuilder().setRc(1).setLeader(leaderId)
					.build();
			responseObserver.onNext(rsp);
		}
	}

	public List<String> getNodes() {
		try {

			ArrayList<String> nodeID = new ArrayList<String>();
			List<String> allLines = Files
					.readAllLines(Paths.get("//Volumes/SJSU/CS249 Distributed Computing/Project-3/host.txt"));
			for (String line : allLines) {
				nodeID.add(line.substring(0, line.lastIndexOf(" ")));

			}
			return nodeID;

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<String> getPeers() {
		try {
			ArrayList<String> peers = new ArrayList<String>();
			List<String> allLines = Files
					.readAllLines(Paths.get("//Volumes/SJSU/CS249 Distributed Computing/Project-3/host.txt"));
			for (String line : allLines) {

				peers.add(line.substring(line.indexOf(" ")));

			}

			return peers;

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		RaftMain raftMain = new RaftMain();

		System.out.println("Enter the Host on which server has to run:");
		Scanner hostInput = new Scanner(System.in);
		String host = "10.10.10.14";// hostInput.nextLine(); //
		System.out.println("Enter the port on which server has to run:");
		int port = 4444;// Integer.parseInt(hostInput.nextLine()); //
		System.out.println("server started on " + host + ":" + port);

		RaftMain server = new RaftMain(port);
		raftMain.stubDictionary = server.stubDictionary;
		System.out.println("raftMain" + raftMain.stubDictionary);
		System.out.println(server.stubDictionary);
		System.out.println("server started on " + port);

		raftMain.broadcastMain();

		executorService.shutdownNow();

		server.server.awaitTermination();
	}

}
