package com.doselect;

public class Studentsreport {
	private String firstname;
	private String lastname;
	private int score;
	

	public Studentsreport(String firstname, String lastname, int score) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.score = score;
	}

	public Studentsreport() {
		super();
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}



	

}
