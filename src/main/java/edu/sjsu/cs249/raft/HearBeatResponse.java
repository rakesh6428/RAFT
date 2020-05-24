package edu.sjsu.cs249.raft;

public class HearBeatResponse {
	private long term;
	private int candidateId;

	public HearBeatResponse() {
	};

	public HearBeatResponse(int candidateId,long term) {
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
