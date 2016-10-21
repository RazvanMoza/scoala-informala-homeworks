package test.siit.java4.salariescomputation;

import org.junit.Test;
import static org.junit.Assert.*;

import siit.java4.salariescomputation.LineFragmenter;
import siit.java4.salariescomputation.Person;

public class LineFragmenterUnitTest {

	@Test
	public void managerCheck() {
		Person p = new Person("Razvan", "Sales Manager", 80, 0, 0, 0, 0);

		LineFragmenter lf = new LineFragmenter();
		String s = "Razvan|Sales Manager|80|0|0|0|0";
		Person result = lf.fragmenter(s);

		assertEquals(p, result);
	}

	@Test
	public void salesOfficerCheck() {
		Person p = new Person("Marian", "Sales Officer", 80, 4, 10, 15, 0);

		LineFragmenter lf = new LineFragmenter();
		String s = "Marian|Sales Officer|80|4|10|15|0";
		Person result = lf.fragmenter(s);

		assertEquals(p, result);
	}

	@Test
	public void seniorSalesOfficerCheck() {
		Person p = new Person("Vasile", "Senior Sales Officer", 80, 4, 10, 15, 0);

		LineFragmenter lf = new LineFragmenter();
		String s = "Vasile|Senior Sales Officer|80|4|10|15|0";
		Person result = lf.fragmenter(s);

		assertEquals(p, result);
	}
}
