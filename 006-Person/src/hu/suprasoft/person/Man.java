package hu.suprasoft.person;

/**
 * @author VarGabor
 *
 */

public class Man extends Person {
	public Man(String name, double height) {
		super(name, height);
	}

	@Override
	public String getHobby() {
		return "Repairing things";
	}
}
