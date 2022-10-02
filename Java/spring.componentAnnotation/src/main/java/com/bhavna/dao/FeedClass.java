package com.bhavna.dao;
import java.util.*;

import org.springframework.stereotype.Component;

//import org.springframework.beans.factory.annotation.Value;

@Component("feedClass")
public class FeedClass {
	public List<String> memberList=new ArrayList<String>();
	public Map<String,String> brancheList=new HashMap<String,String>();
	public FeedClass() {
		super();
		memberList.add("John");
		memberList.add("George");
		memberList.add("Alex");
		memberList.add("Ethan");

		brancheList.put("1","Delhi");
		brancheList.put("2","Noida");
		brancheList.put("3","Gurugram");
	}

}
