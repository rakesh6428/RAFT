package edu.sjsu.cs249.raft;

public class Leader {
	 private int cadidateId;
	  private int leaderId;

	  public Leader() {};
	  
	  public Leader(int cadidateId, int leaderId) {
	    this.cadidateId = cadidateId;
	    this.leaderId = leaderId;
	  }

	  public int cadidateId(){
	    return cadidateId;
	  }
	  
	  public int leaderId(){
	    return leaderId;
	  }
}
