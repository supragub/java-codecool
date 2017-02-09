package hu.suprasoft.encapsulatewhat;

/**
 * @author VarGabor
 *
 */

import java.util.Arrays;
import java.util.List;

public class Balance {

	private Transaction[] transactions;

	public Balance(int startingBalance) {
		this.transactions = new Transaction[1];
		this.transactions[0] = new Transaction("Money from your father", startingBalance);
	}

	public void receiveSalary(String msg, int salary) {
		addNewTransaction(msg, salary);
	}

	public void payForProduct(String msg, int cost) {
		addNewTransaction(msg, -1 * cost);
	}

	public int getCurrentBalance() {
		int currentBalance = 0;
		for (Transaction t : this.transactions) {
			currentBalance += t.getAmount();
		}
		return currentBalance;
	}

	public List<Transaction> getTransactions() {
		return Arrays.asList(this.transactions);
	}

	private void addNewTransaction(String msg, int amount) {
		this.transactions = Arrays.copyOf(this.transactions, this.transactions.length + 1);

		this.transactions[this.transactions.length - 1] = new Transaction(msg, amount);
	}
}
