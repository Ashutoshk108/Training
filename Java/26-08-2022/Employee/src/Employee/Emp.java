package Employee;

import java.util.*;
public class Emp  implements EmpInter{
	private String First_name;
	private String Last_name;
	private String Mob_no;
	private String email_id;
	private int id;
	
	
	public String getFirst_name() {
		return First_name;
	}


	public void setFirst_name(String first_name) {
		First_name = first_name;
	}


	public String getLast_name() {
		return Last_name;
	}


	public void setLast_name(String last_name) {
		Last_name = last_name;
	}


	public String getMob_no() {
		return Mob_no;
	}


	public void setMob_no(String mob_no) {
		Mob_no = mob_no;
	}


	public String getEmail_id() {
		return email_id;
	}


	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}


	public int getId() {
		return id;
	}


	public void setId(short id) {
		this.id = id;
	}
	
	public void getTask() {
		System.out.println("Method to get task for the employee");
	}
	
	public void isTaskDone() {
		System.out.println("Method to perform task");
	}

	public Emp(String first_name, String last_name, String mob_no, String email_id, int id) {
		this.First_name = first_name;
		this.Last_name = last_name;
		this.Mob_no = mob_no;
		this.email_id = email_id;
		this.id = id;
	}

}
