package com.bhavna.assessment;

public class Hexagons extends Shape{
	protected int side;
	
	public Hexagons(int side) {
		super("Hexagons");
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	
	public double calculateArea() {
		return (3*Math.sqrt(3)*this.side*this.side)/2;
	}
	

}
