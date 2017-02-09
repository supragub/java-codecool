package hu.suprasoft.shape2;

/**
 * @author VarGabor
 *
 */

public class Circle extends Coin {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public int getValue() {
		return 2;
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
