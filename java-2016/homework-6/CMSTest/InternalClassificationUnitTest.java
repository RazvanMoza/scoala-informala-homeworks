package CMS;

import java.util.ArrayList;

import org.junit.Test;

public class InternalClassificationUnitTest {

	@Test(expected = CMSException.class)
	public void inputListisEmpty() throws CMSException {

		ArrayList<Employee> employeList = new ArrayList<Employee>();
		new InternalClassification(employeList).classification();

	}

	@Test(expected = CMSException.class)
	public void inputListContainsOtherQualification() throws CMSException {

		ArrayList<Employee> employeList = new ArrayList<Employee>();

		employeList.add(new Employee("Razvan", true, 10, "Boss"));
		employeList.add(new Employee("Vlad", false, 20, "Developer"));
		employeList.add(new Employee("Mihai", false, 15, "Tester"));
		employeList.add(new Employee("Pit", true, 13, "Developer"));
		employeList.add(new Employee("Daniel", false, 5, "Support"));
		employeList.add(new Employee("Andrei", true, 16, "Tester"));
		employeList.add(new Employee("Aurel", false, 14, "Support"));

		new InternalClassification(employeList).classification();

	}
}
