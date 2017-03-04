package hu.suprasoft.hashcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author VarGabor
 *
 */

public class Main {

	public static void main(String[] args) {
		User u1 = new User("Jakab", "Gipsz", 42, 1, 0);
		System.out.format("u1=%s%n", u1.hashCode());

		User u2 = new User("Jakab", "Franco", 33, 0, 1);
		System.out.format("u2=%s%n", u2.hashCode());

		Set<User> users = new HashSet<>();
		System.out.format("add u1=%s%n", users.add(u1));
		System.out.format("add u2=%s%n", users.add(u2));
		User u3 = new User("Jakab", "Nagy", 12, 0, 0);
		System.out.format("u3=%s%n", u3.hashCode());

		System.out.println(users);

		System.out.println(users.contains("Jakab"));
		System.out.format("users contains u3=%s%n", users.contains(u3));
	}
}
