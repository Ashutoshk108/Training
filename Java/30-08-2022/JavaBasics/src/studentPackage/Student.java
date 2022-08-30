package studentPackage;

public class Student {
	public void payFees() {
		System.out.println("You have to pay fees before the start of the next semester.");
	}
	
	public void participate(String name, String event) {
		System.out.println(name+" has participated in "+event);
	}
	
	public void punished(String name, String act) {
		System.out.println(name + " has been punished for "+act);
	}
	public void fillExamForm() {
		System.out.println("Fill exam form!");
	}
}