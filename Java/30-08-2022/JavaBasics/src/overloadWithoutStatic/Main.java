package overloadWithoutStatic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder obj=new Adder();
		System.out.println(obj.sum(5,8));
		System.out.println(obj.sum(5.8,8.5,4.8));
	}

}
