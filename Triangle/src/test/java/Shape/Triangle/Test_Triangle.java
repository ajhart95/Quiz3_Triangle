package Shape.Triangle;

import static org.junit.Assert.*;

import org.junit.Test;

import Shape.Triangle.Triangle;

public class Test_Triangle {
	
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	Triangle test = new Triangle();
	
	@Test
	public void Area_test() {
		test.setSide1(side1);
		test.setSide2(side2);
		test.setSide3(side3);
		
		double test_area = test.getArea();
		double known_area = 0.433; 
		
		assertTrue((test_area < (known_area + 0.001)) 
				&& (test_area > (known_area - 0.001)));	
	}
	
	@Test
	public void Perimeter_Test(){
		test.setSide1(side1);
		test.setSide2(side2);
		test.setSide3(side3);
		
		double test_perimeter = test.getPerimeter();
		double known_perimeter = 3.0;
		
		assertTrue((test_perimeter < (known_perimeter + 0.001)) 
				&& (test_perimeter > (known_perimeter - 0.001)));
	}
}
