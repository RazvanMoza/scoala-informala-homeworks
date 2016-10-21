package siit.java4.bubblesort;

import org.junit.Test;
import static org.junit.Assert.*;
import siit.java4.bubblesort.BubbleSort;
import siit.java4.bubblesort.Person;

public class BubbleSortUnitTest {

	@Test
	public void numberSort() {
		Integer[] testList = new Integer[] { 1, 2, 3, 4, 6, 7, 11, 14, 16 };

		BubbleSort sortAlg = new BubbleSort();
		Integer[] numbers = new Integer[] { 11, 6, 2, 4, 3, 16, 7, 14, 1 };
		Integer[] sortedNumbers = sortAlg.sortPrimitives(numbers);

		assertArrayEquals(testList, sortedNumbers);
	}

	@Test
	public void stringSort() {
		String[] testList = new String[] { "Ana", "Bogdan", "Calin", "Ionut", "Mihai", "Razvan" };

		BubbleSort sortAlg = new BubbleSort();
		String[] names = new String[] { "Ionut", "Ana", "Mihai", "Calin", "Bogdan", "Razvan" };
		String[] sortedNames = sortAlg.sortPrimitives(names);

		assertArrayEquals(testList, sortedNames);
	}

	@Test
	public void objectSort() {
		Person[] testPersoane = new Person[] { new Person("Ana", 30), new Person("Bianca", 25), new Person("Ioana", 27),
				new Person("Maria", 18) };

		BubbleSort sortAlg = new BubbleSort();
		Person[] persoane = new Person[] { new Person("Ana", 30), new Person("Bianca", 25), new Person("Maria", 18),
				new Person("Ioana", 27) };
		Person[] sortedPersoane = sortAlg.sortObjects(persoane, Person.NAME_COMP);
		
		assertArrayEquals(testPersoane, sortedPersoane);

	}

}
