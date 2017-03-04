package hu.suprasoft.hashcode;

/**
 * @author VarGabor
 *
 */

public class User {

	private String firstName;
	private String lastName;
	private int age;
	private int numberOfKids;
	private int numberOfHouses;

	public User(String firstName, String lastName, int age, int numberOfKids, int numberOfHouses) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.numberOfKids = numberOfKids;
		this.numberOfHouses = numberOfHouses;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public int getNumberOfKids() {
		return numberOfKids;
	}

	public int getNumberOfHouses() {
		return numberOfHouses;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof User) {
			User u = (User) obj;
			return this.firstName.equals(u.getFirstName());
		}
		return false;
	}
}
