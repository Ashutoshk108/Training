package Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp obj=new Emp("Aman", "Gupta","9678543210","aman@gmail.com",1);
		System.out.println("ID\tFirst_Name\tLast_Name\tMobile_No\tEmail_id");
		System.out.println(obj.getId()+"\t"+obj.getFirst_name()+"\t\t"+obj.getLast_name()+"\t\t"+obj.getMob_no()+"\t"+obj.getEmail_id());
		obj.getTask();
	}

}
