package com.raghavx.hr;

import java.util.Date;

public class Education {

	private final Date passingDate, joiningDate;
	private final String boardName, universityName;
	
	public Education(Date passingDate, Date joiningDate, String boardName, String universityName) {
		
		this.passingDate = passingDate;
		this.joiningDate = joiningDate;
		this.boardName = boardName;
		this.universityName = universityName;
	}

	public Date getPassingDate() {
		return passingDate;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public String getBoardName() {
		return boardName;
	}

	public String getUniversityName() {
		return universityName;
	}
	
	
	
}
