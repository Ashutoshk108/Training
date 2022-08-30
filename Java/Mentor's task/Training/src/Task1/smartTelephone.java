package Task1;

public class smartTelephone extends telephone {

	public void lift() {
		System.out.println("lift!!");
	}
	
	public void disconnected() {
		System.out.println("disconnected!!");
	}
	
	public void disconnected(String name) {
		System.out.println(name+" disconnected the call");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smartTelephone obj=new smartTelephone();
		obj.disconnected();
		obj.disconnected("Aman");

	}

}
