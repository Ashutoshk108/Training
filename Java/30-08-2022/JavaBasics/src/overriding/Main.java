package overriding;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine obj;
		obj=new Engine();
		obj.engine();
		obj=new Bike();
		obj.engine();
		obj=new Scooter();
		obj.engine();
		obj=new Car();
		obj.engine();
		obj=new Aeroplane();
		obj.engine();
	}

}
