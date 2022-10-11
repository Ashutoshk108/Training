package com.bhavna.bean;

public class ReferralBean {
	private int id;
	private String name;
	private String mobile;
	private int age;
	private int code;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public ReferralBean(int id, String name, String mobile, int age, int code) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.age = age;
		this.code = code;
	}
	public ReferralBean() {
		super();
	}
	@Override
	public String toString() {
		return "ReferralBean [id=" + id + ", name=" + name + ", mobile=" + mobile + ", age=" + age + ", code=" + code
				+ "]";
	}
	
}