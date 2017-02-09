package hu.suprasoft.shape1;

/**
 * @author VarGabor
 *
 */

public class Circle implements Shape {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

}
