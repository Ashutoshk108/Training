package Task2;

public class human extends monkey implements basicAnimal {
	public void eat() {
		System.out.println("Every living entity needs to eat food.");
	}
	public void sleep() {
		System.out.println("Every living entity needs to sleep.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		human obj=new human();
		obj.eat();
		obj.bite();
		obj.jump();
		obj.sleep();
		obj.jump("Long");

	}

}
