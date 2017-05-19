package ua.training.immutaible;

public final class Triangle {
	private final Point a,b,c;

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a.clone();
		this.b = b.clone();
		this.c = c.clone();
	}

	public Point getA() {
		return a.clone();
	}

	public Point getB() {
		return b.clone();
	}

	public Point getC() {
		return c.clone();
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	@Override
	public Triangle clone() {
		try{
			Triangle result = new Triangle(a, b, c);
			return result;
	}catch(Exception ex) {
		throw new RuntimeException(ex);
	}}
	
	
	
	
}
