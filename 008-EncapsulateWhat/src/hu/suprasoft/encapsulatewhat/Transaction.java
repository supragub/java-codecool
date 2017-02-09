package hu.suprasoft.encapsulatewhat;

/**
 * @author VarGabor
 *
 */

public class Transaction {

	private final String message;
	private final int amount;

	Transaction(String message, int amount) {
		this.message = message;
		this.amount = amount;
	}

	public String getMessage() {
		return this.message;
	}

	public int getAmount() {
		return this.amount;
	}
}
