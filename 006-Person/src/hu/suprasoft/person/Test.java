package hu.suprasoft.person;

/**
 * @author VarGabor
 *
 */

public class Test {
	public static void main(String[] args) {
		Person p1 = new Woman("Trixi", 1.70);
		Person p2 = new Man("Marci", 1.78);
		Person p3 = new Woman("Agi", 1.75);
		Person p4 = new Man("Sziszka", 1.73);
		// Person[] persons = {p1, p2, p3, p4};
		Person[] persons = new Person[4];
		persons[0] = p1;
		persons[1] = p2;
		persons[2] = p3;
		persons[3] = p4;
		Person tallest = getTallest(persons);
		System.out.println(tallest.getName() + "\t" + tallest.getHobby());
	}

	public static Person getTallest(Person[] persons) {
		// double maxHeight = -1.0;
		// Person tallest = null;
		// for (Person person : persons)
		// {
		// if (maxHeight < person.getHeight())
		// {
		// maxHeight = person.getHeight();
		// tallest = person;
		// }
		// }
		// return tallest;
		double maxHeight = persons[0].getHeight();
		Person tallest = persons[0];
		// for (Person person : persons)
		// {
		// if (maxHeight < person.getHeight())
		// {
		// maxHeight = person.getHeight();
		// tallest = person;
		// }
		// }
		for (int i = 1; i < persons.length; i++) {
			Person person = persons[i];
			if (maxHeight < person.getHeight()) {
				maxHeight = person.getHeight();
				tallest = person;
			}
		}
		return tallest;
	}
}
