package siit.java4.cms;

import java.util.ArrayList;
import org.junit.Test;

import siit.java4.cms.CMSException;
import siit.java4.cms.CompanyManagementSystem;
import siit.java4.cms.Employee;

public class CompanyIntegrationTest {

	@Test
	public void processIsWorking() throws CMSException {

		ArrayList<Employee> employeList = new ArrayList<Employee>();

		employeList.add(new Employee("Razvan", true, 10, "Manager"));
		employeList.add(new Employee("Vlad", false, 20, "Developer"));
		employeList.add(new Employee("Mihai", false, 15, "Tester"));
		employeList.add(new Employee("Pit", true, 12, "Developer"));
		employeList.add(new Employee("Daniel", false, 5, "Support"));
		employeList.add(new Employee("Andrei", true, 16, "Tester"));
		employeList.add(new Employee("Aurel", false, 14, "Support"));

		new CompanyManagementSystem(employeList).classification();

		System.out.println(
				"========================================================================================================================");
		new CompanyManagementSystem(employeList).operation();
	}
}
