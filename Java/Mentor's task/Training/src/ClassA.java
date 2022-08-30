
public class ClassA implements Showable {
	
	public void show() {
		System.out.println("Show");
	}
	
	public void print() {
		System.out.println("Print function");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Showable obj= new ClassA();
		//obj.show();
		obj.print();
		obj.show();
		

	}

}

