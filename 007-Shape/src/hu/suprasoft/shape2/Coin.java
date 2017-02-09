package hu.suprasoft.shape2;

/**
 * @author VarGabor
 *
 */

public abstract class Coin implements Shape {
	public abstract int getValue();

	public double getRealValue() {
		return getValue() * getArea() - getPerimeter();
	}
}
