package hu.suprasoft.inputoutput;

/**
 * @author VarGabor
 *
 */

import java.util.Scanner;

public class InputOutput {

	private String str;

	public InputOutput() {
		this.str = "";
	}

	public void getString() {
		Scanner scanner = new Scanner(System.in);
		this.str = scanner.nextLine();
	}

	public void printString() {
		System.out.println(this.str);
	}
}