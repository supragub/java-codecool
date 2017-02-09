package hu.suprasoft.shape1;

/**
 * @author VarGabor
 *
 */

public class Test {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[4];
		shapes[0] = new Circle(2.0);
		shapes[1] = new Circle(3.0);
		shapes[2] = new Rectangle(3.0, 4.6);
		shapes[3] = new Rectangle(2.0, 7.6);
	}

	public static double getTotalArea(Shape[] shapes) {
		double total = 0.0;
		for (Shape shape : shapes) {
			total += shape.getArea();
		}
		return total;
	}
}
