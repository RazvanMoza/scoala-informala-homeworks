package siit.java4.cms;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.TreeSet;
import org.junit.Test;

import siit.java4.cms.CMSException;
import siit.java4.cms.CompanyManagementSystem;
import siit.java4.cms.Employee;
import siit.java4.cms.SeniorityComparator;

public class CompanyManagementSystemUnitTest {

	@Test
	public void addTwoEmployeesWithSameSeniority() throws CMSException {

		ArrayList<Employee> employeList = new ArrayList<Employee>();
		employeList.add(new Employee("Razvan", false, 20, "Manager"));
		employeList.add(new Employee("Vlad", false, 20, "Developer"));
	}

	@Test
	public void listIsCorrectDisplayed() throws CMSException {

		ArrayList<Employee> employeList = new ArrayList<>();
		TreeSet<Employee> newEmployeeList = new TreeSet<>(new SeniorityComparator());

		employeList.add(new Employee("Razvan", true, 10, "Manager"));
		employeList.add(new Employee("Vlad", false, 5, "Developer"));
		employeList.add(new Employee("Mihai", false, 5, "Tester"));
		employeList.add(new Employee("Pit", true, 12, "Developer"));
		employeList.add(new Employee("Daniel", false, 5, "Support"));
		employeList.add(new Employee("Andrei", true, 16, "Tester"));
		employeList.add(new Employee("Aurel", false, 10, "Support"));

		TreeSet<Employee> test1 = new CompanyManagementSystem(employeList).operation();

		newEmployeeList.add(new Employee("Daniel", false, 5, "Support"));
		newEmployeeList.add(new Employee("Aurel", false, 10, "Support"));
		newEmployeeList.add(new Employee("Mihai", false, 5, "Tester"));
		newEmployeeList.add(new Employee("Vlad", false, 5, "Developer"));

		assertEquals(newEmployeeList, test1);
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

		new CompanyManagementSystem(employeList).classification();

	}
}
