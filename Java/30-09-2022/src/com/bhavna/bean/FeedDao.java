package com.bhavna.bean;

import java.util.List;

import org.springframework.stereotype.Component;

@Component("FeedDao")
public class FeedDao {
	List<String> language;
	
	public void feedLanguage() {
		language.add("English");
		language.add("Hindi");
		language.add("Spanish");
	}
}
