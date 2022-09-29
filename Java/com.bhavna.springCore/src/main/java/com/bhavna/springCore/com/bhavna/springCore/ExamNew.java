package com.bhavna.springCore.com.bhavna.springCore;

public class ExamNew {
	private int eId;
	private String name;
	private int marks;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public ExamNew(int eId, String name, int marks) {
		super();
		this.eId = eId;
		this.name = name;
		this.marks = marks;
	}
	public ExamNew() {
		super();
	}
	@Override
	public String toString() {
		return "ExamNew [eId=" + eId + ", name=" + name + ", marks=" + marks + "]";
	}
	

}
