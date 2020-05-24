package edu.sjsu.cs249.raft;

public interface MessageChannel {

	public void send(Raft source, Object o);
}
