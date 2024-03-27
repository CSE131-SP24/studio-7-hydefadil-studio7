package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class rectangle {
	private double xCtr;
	private double yCtr;
	private double halfWidth;
	private double halfHeight;
	
	public rectangle(double initxCtr, double inityCtr, double inithalfWidth, double inithalfHeight) {
		xCtr = initxCtr;
		yCtr = inityCtr;
		halfWidth = inithalfWidth;
		halfHeight = inithalfHeight;
	}
	
	public void draw() {
		StdDraw.rectangle(xCtr, yCtr, halfWidth, halfHeight);
	}
	
	public double Area() {
		double area = (halfWidth*2)*(halfHeight*2);
		return area;
	}
	
	public void printPerimeter() {
		double perimeter = (4*halfWidth)+(4*halfHeight);
		System.out.println("Perimeter: " + perimeter);
	}
	
	public static boolean compareArea(double r1Area, double r2Area) {
		if(r1Area > r2Area) {
		return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle r1 = new rectangle(0.5, 0.5, 0.25, 0.2);
		r1.draw();
		double r1Area = r1.Area();
		System.out.println("Area = " + r1Area);
		r1.printPerimeter();
		 
		rectangle r2 = new rectangle(0.5, 0.5, .3, .25);
		r2.draw();
		double r2Area = r2.Area();
		System.out.println("Area = " + r2Area);
		r2.printPerimeter();
		if(compareArea(r1Area, r2Area)) {
			System.out.println("Rectangle 1's area is larger");
		}
		else
			System.out.println("Rectangle 2's area is larger");
		
		}
	}



