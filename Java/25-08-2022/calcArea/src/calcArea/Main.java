package calcArea;

import java.util.*;
public class Main {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		areaShape obj=new areaShape(3,5,6,4);
		System.out.print("Area of square: ");
		obj.areaSquare();
		System.out.print("Area of rectangle: ");
		obj.areaRect();
		System.out.print("Area of circle: ");
		obj.areaCircle();
		obj.setLength(8);
		System.out.print("Area of rectangle: ");
		obj.areaRect();
	}

}
