package hu.suprasoft.shape2;

/**
 * @author VarGabor
 *
 */

public class Rectangle extends Coin {
	double a;
	double b;

	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int getValue() {
		return 5;
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
