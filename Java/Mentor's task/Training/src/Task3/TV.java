package Task3;

public class TV implements TVremote{
	public void power() {
		System.out.println("Power ON/OFF");
		
	}
	public void volume() {
		System.out.println("Volume up/down");
	}
	
	public void home() {
		System.out.println("Home button");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV obj=new TV();
		obj.power();
	}

}
