package edu.sjsu.cs249.raft;

public interface ClusterMember {

	public MessageChannel getChannel();
	
	public long getNextIndex();
	
	public void setNextIndex(long index);
	
	public long getMatchIndex();

	public void setMatchIndex(long matchIndex);

	public long getLastCommandReceived();
	
	public void setLastcommandReceived(long time);
}
