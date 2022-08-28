package Bank;

public interface BankInterface {
	public double effROI(int age, String gendr, double duration, double roi);
	//public double CalInt(double amnt, double roi, double duration, String type);
	public double getInt(double amnt, double roi);
	public void printSimpInt(double amnt, double roi, double duration);
	public void printCompInt(double amnt, double roi, double duration);
}
