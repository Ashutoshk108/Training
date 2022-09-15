package com.bhavna.task2;

import java.util.*;
public class Item {
	private int itemId;
	private String name;
	private int price;
	
	public Item() {
		
	}
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Item(int itemId, String name, int price) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.price = price;
	}
	public void insertItem() {
		try {
			ArrayList<Item> itemLst=new ArrayList<Item>();
			Item itm1=new Item(1,"Pen",50);
			Item itm2=new Item(2,"Milk",80);
			Item itm3=new Item(3,"Clothes",1000);
			
			itemLst.add(itm1);
			itemLst.add(itm2);
			itemLst.add(itm3);
			
			if(itemLst.isEmpty()) {
				throw new CartEmptyException("CartEmptyException raised!");
			}else {
				for(Item itm:itemLst) {
					System.out.println(itm.itemId+"\t"+itm.name+"\t"+itm.price);
				}
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
/*
Write  program to accept records of Item (itemId,name,price) from user and store into ArrayList.
If ArrayList is empty throw user defined CartEmptyException else display records from arraylist as cart
*/