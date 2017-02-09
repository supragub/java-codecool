package hu.suprasoft.shape1;

/**
 * @author VarGabor
 *
 */

public class Rectangle implements Shape {
	double a;
	double b;

	public Rectangle(double side_a, double b) {
		this.a = side_a;
		this.b = b;
	}

	@Override
	public double getArea() {
		return a * b;
	}

	@Override
	public double getPerimeter() {
		return 2 * (a + b);
	}

}
