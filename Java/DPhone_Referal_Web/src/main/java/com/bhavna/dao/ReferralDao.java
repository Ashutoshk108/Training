package com.bhavna.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bhavna.bean.ReferralBean;

public class ReferralDao {
	static List<ReferralBean> list = new ArrayList<ReferralBean>();
	//list.add(new ReferralBean(0,"Axat",19));

	public void addReferral(ReferralBean person) {
		list.add(person);
		System.out.println("in add" + person);
	}

	public void viewReferral() {
		System.out.println("All Referrals");
		Iterator<ReferralBean> itr = list.iterator();// getting the Iterator
		while (itr.hasNext()) {// check if iterator has the elements
			System.out.println(itr.next());
			System.out.println(list);
		}
	}
	public static List<ReferralBean> getReferrals(){
		return list;
	}
}
