package com.bhavna.bean;

import java.util.*;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class Department {
	@Value("911")
	private int dId;
	@Value("Development")
	private String departmentName;
	
	@Value("#{feedClass.memberList}")
	private List<String> members;
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public List<String> getMembers() {
		return members;
	}
	public void setMembers(List<String> members) {
		this.members = members;
	}
	
	public Department(int dId, String departmentName, List<String> members) {
		super();
		this.dId = dId;
		this.departmentName = departmentName;
		this.members = members;
	}
	public Department() {
		super();
	}
	@Override
	public String toString() {
		return "Department [dId=" + dId + ", departmentName=" + departmentName + ", members=" + members + "]";
	}
}
