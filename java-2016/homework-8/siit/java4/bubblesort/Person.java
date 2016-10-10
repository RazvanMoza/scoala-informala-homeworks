package siit.java4.bubblesort;

import java.util.Comparator;

public class Person {

	public static final Comparator<Person> NAME_COMP = new Comparator<Person>() {

		@Override
		public int compare(Person p1, Person p2) {
			return 0;
		}
	};

	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

}
