package hu.suprasoft.person;

/**
 * @author VarGabor
 *
 */

public class Woman extends Person {
	public Woman(String name, double height) {
		super(name, height);
	}

	@Override
	public String getHobby() {
		return "Cooking";
	}
}
