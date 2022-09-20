package com.bhavna.assessment.user;
import com.bhavna.assessment.service.Referral;
public class Main {
	public static void main(String[] args) throws Exception {
		//Scanner sc=new Scanner(System.in);
		
		Account usr=new Account();
		//usr.register();
		//usr.login();
		
		//creating Referral object
		Referral ref1=new Referral("Aman",54785645l,"aman@gmail.com",true);
		System.out.println("Name\tMob_No\t\tEmail_id\tStatus");
		ref1.viewReferral();
		Referral ref2=new Referral("Ajay",54785645l,"ajay@gmail.com",false);
		ref2.viewReferral();
		
		ref2.editReferral(897867l, "ajay12@gmail.com");
		ref2.viewReferral();
		ref2.deleteReferral(ref2);
		ref2.write(ref2);
		Referral ref3=new Referral("Rahul",54785645l,"rahul@gmail.com",true);
		System.out.println("Your bonus points: "+ref3.getPnts());
		
	}

}
/*Referral[] arrRef=new Referral[5];
System.out.println("\t*******Menu********");
System.out.println("Enter 1 to register a new user ");
System.out.println("Enter 2 to login ");
System.out.println("Enter 3 to refer a person: ");
Account user=new Account();
Referral ref=new Referral();
int choice=sc.nextInt();
if(choice==1) {
	user.register();
}else if(choice==2) {
	user.login();
}else if(choice==3) {
	ref.refer("Aman",4569985645l,"aman@gmail.com",true);
	System.out.println("Details of referred person: ");
	ref.viewReferral(ref);
	ref.editReferral(ref, 67856345l, "Amandeep@gmail.com");
	ref.viewReferral(ref);
	ref.deleteReferral(ref);
	ref.viewReferral(ref);
	ref.writeToFile();
}*/
//creating object of Account class;