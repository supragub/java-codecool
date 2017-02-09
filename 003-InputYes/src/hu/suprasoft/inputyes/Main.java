package hu.suprasoft.inputyes;

/**
 * @author VarGabor
 *
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Write something and press <Enter>!");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String output;
		if ("yes".equals(input.toLowerCase())) {
			output = "Yes";
		} else {
			output = "No";
		}
		System.out.println(output);
	}
}
