package hu.suprasoft.encapsulatewhat;

/**
 * @author VarGabor
 *
 */

public class Main {

	public static void main(String[] args) {
		Balance b = new Balance(1000);
		b.receiveSalary("Good job!", 10000);
		b.payForProduct("Milk and eggs", 100);
		b.payForProduct("Car: Porsche", 1000000);
		System.out.format("Your balance is: %s PESOS%n", b.getCurrentBalance());

		for (Transaction t : b.getTransactions()) {
			System.out.println(t.getMessage());
		}
	}
}
