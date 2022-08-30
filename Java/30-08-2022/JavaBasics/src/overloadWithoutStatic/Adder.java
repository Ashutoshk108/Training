package overloadWithoutStatic;

public class Adder {
	public double sum(double n1, double n2, double n3) {
		return n1+n2+n3;
	}
	public int sum(int n1,int n2) {
		return n1+n2;
	}
}
