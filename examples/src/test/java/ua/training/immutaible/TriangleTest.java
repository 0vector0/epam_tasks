package ua.training.immutaible;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.training.immutaible.Point;

public class TriangleTest {

	@Test
	public void testTriangleImmutability() {
		Point a = new Point(0,0);
		Point b = new Point(0,3);
		Point c = new Point(4, 0);
				
				
		Triangle trinagle = new Triangle(a,b,c);
		System.out.println( trinagle);
		String expected = "Triangle [a=Point [x=0.0, y=0.0], b=Point [x=0.0, y=3.0], c=Point [x=4.0, y=0.0]]";
		a.setY(-100500);
		String actual = trinagle.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMoreTriangleImmutability() {
		Point a = new Point(0,0);
		Point b = new Point(0,3);
		Point c = new Point(4, 0);
				
				
		Triangle trinagle = new Triangle(a,b,c);
		System.out.println( trinagle);
		String expected = "Triangle [a=Point [x=0.0, y=0.0], b=Point [x=0.0, y=3.0], c=Point [x=4.0, y=0.0]]";
		a = trinagle.getA();
		a.setY(-100500);
		String actual = trinagle.toString();
		assertEquals(expected, actual);
	}

}
