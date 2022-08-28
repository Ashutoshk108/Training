package calcArea;

import java.util.*;

public class areaShape {
	private int length, width, radius, side;
	
	areaShape(int length, int width, int radius, int side){
		this.length=length;
		this.width=width;
		this.side=side;
		this.radius=radius;
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public void areaCircle() {
		System.out.println(Math.PI*Math.pow(this.radius, 2));
	}
	public void areaRect() {
		System.out.println(length*width);
	}
	public void areaSquare() {
		System.out.println(side*side);
	}
	
}
