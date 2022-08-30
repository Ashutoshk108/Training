package SMS;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		//System.out.print("Enter ")
		Course obj=new Course();
		obj.enroll("Aman","B.Tech");
		
		FirstYearStud obj1=new FirstYearStud();
		obj1.describe("Aman");
		obj1.ActvityOverview();
		
		SecondYearStud obj2=new SecondYearStud();
		obj2.describe("Axat");
		obj2.ActvityOverview();
		
	}

}
