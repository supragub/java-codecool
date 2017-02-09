package hu.suprasoft.shape2;

/**
 * @author VarGabor
 *
 */

public class Test {
	public static void main(String[] args) {
		Coin coin1 = new Circle(3.0);
		Coin coin2 = new Rectangle(1, 2);
		Coin coin3 = new Triangle(1, 2, 3);
		Coin[] coins = new Coin[] { coin1, coin2, coin3 };
		double total = getTotalAmount(coins);
		System.out.println(total);
	}

	public static double getTotalAmount(Coin[] coins) {
		double total = 0.0;
		for (Coin coin : coins) {
			total += coin.getRealValue();
		}
		return total;
	}
}
