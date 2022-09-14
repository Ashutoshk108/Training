package com.bhavna.task2;

import java.io.Serializable;

public class Players implements Comparable<Players>,Serializable{
	private String name;
	private String teamName;
	private int noOfMatches;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getNoOfMatches() {
		return noOfMatches;
	}
	public void setNoOfMatches(int noOfMatches) {
		this.noOfMatches = noOfMatches;
	}
	
	public Players(String name, String teamName, int noOfMatches) {
		super();
		this.name = name;
		this.teamName = teamName;
		this.noOfMatches = noOfMatches;
	}
	@Override
	public int compareTo(Players o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
