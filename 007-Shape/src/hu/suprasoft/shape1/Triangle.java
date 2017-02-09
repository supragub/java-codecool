package hu.suprasoft.shape1;

/**
 * @author VarGabor
 *
 */

public class Triangle implements Shape {
	double a;
	double b;
	double c;

	public Triangle(double a, double b, double c) {
		// if (a + b <= c || a + c <= b || b + c <= a)
		// {
		// throw new RuntimeException("Invalid sides");
		// }
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double getArea() {
		double s = getPerimeter() / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	@Override
	public double getPerimeter() {
		return a + b + c;
	}
}
