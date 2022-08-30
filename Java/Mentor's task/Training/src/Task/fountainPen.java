package Task;

class fountainPen extends Pen {
	public void write() {
		System.out.println("It can write!");
	}
	
	public void refill() {
		System.out.println("It can be refilled!");
	}
	
	public void nibChange() {
		System.out.println("It's nib can be changed!");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fountainPen obj=new fountainPen();
		obj.write();
		obj.refill();
		obj.nibChange();

	}
}
