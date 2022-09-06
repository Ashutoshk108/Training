package com.bhavna.task2;

public class Company {
	private int cId;
	private String name;
	private String city;
	private int turnover;
	private int noOfEmp;
	
	public Company(int cId, String name, String city, int turnover, int noOfEmp) {
		super();
		this.cId = cId;
		this.name = name;
		this.city = city;
		this.turnover = turnover;
		this.noOfEmp = noOfEmp;
	}
	
	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getTurnover() {
		return turnover;
	}

	public void setTurnover(int turnover) {
		this.turnover = turnover;
	}

	public int getNoOfEmp() {
		return noOfEmp;
	}

	public void setNoOfEmp(int noOfEmp) {
		this.noOfEmp = noOfEmp;
	}

	public void display() {
		System.out.println(cId+"\t"+name+"\t"+city+"\t"+turnover+"\t"+noOfEmp);
	}
	
}

/*
 Write Program to accept the Company records as cId,name,city,turnover,number of emloyees
and
1.Display All Companies
2.Display All Companies having employee greater than 100
3. Display All Companies  from Patan
4. Display All Companies Record having turnover between 1000-10000
*/