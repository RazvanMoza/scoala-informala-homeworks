package siit.java4.bubblesort;

import java.util.Arrays;

/**
 * The Class Main.
 */
public class Main {

	public static void main(String[] args) {

		BubbleSort sortAlg = new BubbleSort();

		Integer[] numbers = new Integer[] { 11, 6, 2, 4, 3, 16, 7, 14, 1 };
		Integer[] numbersSorted = sortAlg.sortPrimitives(numbers);
		System.out.println(Arrays.toString(numbersSorted));

		String[] names = new String[] { "Ionut", "Ana", "Mihai", "Calin", "Bogdan", "Razvan" };
		String[] sortedNames = sortAlg.sortPrimitives(names);
		System.out.println(Arrays.toString(sortedNames));

		Person[] persoane = new Person[] { new Person("Ana", 30), new Person("Bianca", 25), new Person("Maria", 18),
				new Person("Ioana", 27) };
		Person[] persoaneSorted = sortAlg.sortObjects(persoane, Person.NAME_COMP);
		System.out.println(Arrays.toString(persoaneSorted));
		
	}

}
