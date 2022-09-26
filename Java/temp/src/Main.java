
public class Main {
	public static void div(int a, int b) {
		try {
			int res=a/b;
			//return res;
		}catch(Exception e) {
			System.out.println(e);
		}finally{
		
			System.out.println("Exce");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Main ob=new Main();
		//obj.div();
		Main.div(2, 0);
	}

}
