package Bank;

public class Calculation implements BankInterface {
	public double effROI(int age, String gendr, double duration, double roi) {
		if(duration>5)
			return roi+=1.5;
		else if(age>60 || (duration>3 && duration<5))
			return roi+=1;
		else if(gendr.equals("f") || (duration>1 &&duration<3))
			return roi+=.5;
		return roi;
	}
	
	public double getInt(double amnt, double roi) {
		return amnt*roi/100;
	}
	
	public void printSimpInt(double amnt, double roi, double duration) {
		double accrued=0;
		double intrst=0;
		for(int i=1;i<=duration;i++) {
			intrst=Math.round(getInt(amnt,roi)*10)/10;
			accrued+=intrst;
			System.out.println(i+"\t"+intrst+"\t\t"+accrued+"\t\t\t"+(amnt+accrued));
		}
	}
	
	public void printCompInt(double amnt, double roi, double duration) {
		double accrued=0;
		double intrst=0;
		for(int i=1;i<=duration;i++) {
			intrst=Math.round(getInt(amnt,roi)*10)/10;
			amnt+=intrst;
			accrued+=intrst;
			System.out.println(i+"\t"+intrst+"\t\t"+accrued+"\t\t\t"+amnt);
		}
	}
}
