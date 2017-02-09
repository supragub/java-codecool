package hu.suprasoft.person;

/**
 * @author VarGabor
 *
 */
public class Person {
	String name;
	double height;
	String hobby;

	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
}
