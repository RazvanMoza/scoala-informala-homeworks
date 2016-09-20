package CMS;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.TreeSet;
import org.junit.Test;

public class CompanyManagementSystemUnitTest {

	@Test
	public void listIsCorrectDisplayed() throws CMSException {

		ArrayList<Employee> employeList = new ArrayList<Employee>();
		TreeSet<Employee> list = new TreeSet<Employee>(new SeniorityComparator());

		employeList.add(new Employee("Razvan", true, 10, "Manager"));
		employeList.add(new Employee("Vlad", false, 20, "Developer"));
		employeList.add(new Employee("Mihai", false, 15, "Tester"));
		employeList.add(new Employee("Pit", true, 12, "Developer"));
		employeList.add(new Employee("Daniel", false, 5, "Support"));
		employeList.add(new Employee("Andrei", true, 16, "Tester"));
		employeList.add(new Employee("Aurel", false, 14, "Support"));

		TreeSet<Employee> test1 = new CompanyManagementSystem(employeList).operation();

		list.add(new Employee("Daniel", false, 5, "Support"));
		list.add(new Employee("Aurel", false, 14, "Support"));
		list.add(new Employee("Mihai", false, 15, "Tester"));
		list.add(new Employee("Vlad", false, 20, "Developer"));

		assertEquals(list, test1);
	}

	@Test(expected = CMSException.class)
	public void inputListisEmpty() throws CMSException {

		ArrayList<Employee> employeList = new ArrayList<Employee>();
		TreeSet<Employee> list = new TreeSet<Employee>(new SeniorityComparator());

		new CompanyManagementSystem(employeList).operation();

		list.add(new Employee("Daniel", false, 5, "Support"));
		list.add(new Employee("Aurel", false, 14, "Support"));
		list.add(new Employee("Mihai", false, 15, "Tester"));
		list.add(new Employee("Vlad", false, 20, "Developer"));

	}
}
