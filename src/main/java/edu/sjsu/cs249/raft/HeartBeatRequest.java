package edu.sjsu.cs249.raft;

public class HeartBeatRequest {
	private long term;
	private int candidateId;

	public HeartBeatRequest() {
	};

	public HeartBeatRequest(long term, int candidateId) {
		this.term = term;
		this.candidateId = candidateId;
	}

	public long term() {
		return term;
	}

	public int memberId() {
		return candidateId;
	}
}
