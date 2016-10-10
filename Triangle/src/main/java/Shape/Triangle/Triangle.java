package Shape.Triangle;
import Shape.Triangle.GeometricObject;

public class Triangle extends GeometricObject{
	
	private double side1;
	private double side2;
	private double side3;
	
	//Constructs the default triangle
	public Triangle(){
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	/**Constructs a triangle with specified sides
	 * 
	 * @param side1
	 * @param side2
	 * @param side3
	 * @throws TriangleException if parameters do not form a valid triangle
	 */
	public Triangle(double side1, double side2, double side3) throws TriangleException{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
		if ((side1 + side2) > side2){
			throw new TriangleException(InvalidTriangle.ShortSide.toString());
		}
	}

	//Returns the area of the triangle
	@Override
	public double getArea() {
		double s = getPerimeter()/2;
		double area = Math.sqrt((s * (s-side1) * (s-side2) * (s-side3)));
		return area;
	}

	//Returns the perimeter of the triangle
	@Override
	public double getPerimeter() {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	
	//Returns a description of the triangle
	public String toString(){
		return "Triangle: Side 1 = " + side1 + "Side 2 = " + side2 + "Side 3 = " + side3 + 
				"\n" + "Triangle Area = " + getArea() + 
				"\n" + "Triangle Perimeter = " + getPerimeter();
	}
	
	
	/**
	 * The following are the public getters and setters for side1, side2, and side3
	 * 
	 */
	
	
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	
}
