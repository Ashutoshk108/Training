package com.bhavna.task1;

import java.util.*;
public class Matches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of matches: ");
		int noOfMatches=sc.nextInt();
		
		ArrayList<Double> scr=new ArrayList<Double>();
		System.out.print("\nEnter n scores: ");
		int totalPnts=0;
		float avgPnts;
		for(int i=0;i<noOfMatches;i++) {
			double tempScr=sc.nextDouble();
			scr.add(tempScr);
			totalPnts+=scr.get(i);
		}
		sc.close();
		avgPnts=(float)totalPnts/noOfMatches;
		System.out.println("Total Points scored by the team: "+totalPnts);
		System.out.println("Average point scored by the team: "+avgPnts);
		
	}

}
