package siit.java4.salariescomputation;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

import siit.java4.salariescomputation.ManagerException;
import siit.java4.salariescomputation.Person;
import siit.java4.salariescomputation.SalaryCalculator;

public class SalaryCalculatorUnitTest {

	@Test
	public void salesOfficerSalaryCheck() throws ManagerException {
		ArrayList<Person> personList = new ArrayList<>();
		ArrayList<Person> personList2 = new ArrayList<>();

		Person r = new Person("Razvan", "Sales Manager", 80, 0, 0, 0, 10000);
		Person p = new Person("Marian", "Sales Officer", 80, 0, 0, 0, 0);
		Person p2 = new Person("Marian", "Sales Officer", 80, 0, 0, 0, 800);

		personList.add(p);
		personList.add(r);
		personList2.add(p2);
		personList2.add(r);

		SalaryCalculator sc = new SalaryCalculator();
		personList = sc.salaryCalculator(personList);

		assertEquals(personList, personList2);
	}
	
	@Test
	public void seniorSalesOfficerSalaryCheck() throws ManagerException {
		ArrayList<Person> personList = new ArrayList<>();
		ArrayList<Person> personList2 = new ArrayList<>();

		Person r = new Person("Razvan", "Sales Manager", 80, 0, 0, 0, 10000);
		Person p = new Person("Marian", "Senior Sales Officer", 80, 0, 0, 0, 0);
		Person p2 = new Person("Marian", "Senior Sales Officer", 80, 0, 0, 0, 1600);

		personList.add(p);
		personList.add(r);
		personList2.add(p2);
		personList2.add(r);

		SalaryCalculator sc = new SalaryCalculator();
		personList = sc.salaryCalculator(personList);

		assertEquals(personList, personList2);
	}
	
	@Test
	public void managerSalaryCheck() throws ManagerException {
		ArrayList<Person> personList = new ArrayList<>();
		ArrayList<Person> personList2 = new ArrayList<>();

		Person r = new Person("Razvan", "Sales Manager", 80, 0, 0, 0, 3500);
		Person p = new Person("Marian", "Senior Sales Officer", 80, 0, 10, 0, 0);
		Person p2 = new Person("Marian", "Senior Sales Officer", 80, 0, 10, 0, 1850);

		personList.add(p);
		personList.add(r);
		personList2.add(p2);
		personList2.add(r);

		SalaryCalculator sc = new SalaryCalculator();
		personList = sc.salaryCalculator(personList);

		assertEquals(personList, personList2);
	}
	
	@Test(expected = ManagerException.class)
	public void noManagerInList() throws ManagerException {
		ArrayList<Person> personList = new ArrayList<>();
		ArrayList<Person> personList2 = new ArrayList<>();

		Person p = new Person("Marian", "Senior Sales Officer", 80, 0, 10, 0, 0);
		Person p2 = new Person("Marian", "Senior Sales Officer", 80, 0, 10, 0, 1850);

		personList.add(p);
		personList2.add(p2);

		SalaryCalculator sc = new SalaryCalculator();
		personList = sc.salaryCalculator(personList);

	}
	
}
