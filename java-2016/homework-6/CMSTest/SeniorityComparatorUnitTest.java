package CMS;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SeniorityComparatorUnitTest {

	@Test
	public void seniorityIsProcesedGood() {
		Employee first = new Employee("Razvan", true, 10, "Manager");
		Employee second = new Employee("Mihai", false, 15, "Developer");
		SeniorityComparator expect = new SeniorityComparator();
		int expected = expect.compare(first, second);

		assertEquals(-1, expected);
	}

	@Test(expected = IllegalArgumentException.class)
	public void seniorityIsProcesedWithNegativeValue() {
		Employee first = new Employee("Razvan", true, -5, "Manager");
		Employee second = new Employee("Mihai", false, 15, "Developer");
		SeniorityComparator expect = new SeniorityComparator();
		int expected = expect.compare(first, second);

	}

	@Test
	public void seniorityIsProcesedWithFirstPersonOlder() {
		Employee first = new Employee("Razvan", true, 20, "Manager");
		Employee second = new Employee("Mihai", false, 15, "Developer");
		SeniorityComparator expect = new SeniorityComparator();
		int expected = expect.compare(first, second);

		assertEquals(1, expected);
	}
}
