/**
 * In the Company class it is created an ArrayList that is filled with employees.
 */
package CMS;

import java.util.ArrayList;

public class Company {

	public static void main(String[] args) throws CMSException {

		ArrayList<Employee> employeList = new ArrayList<Employee>();

		employeList.add(new Employee("Razvan", true, 10, "Manager"));
		employeList.add(new Employee("Vlad", false, 20, "Developer"));
		employeList.add(new Employee("Mihai", false, 15, "Tester"));
		employeList.add(new Employee("Pit", true, 13, "Developer"));
		employeList.add(new Employee("Daniel", false, 5, "Support"));
		employeList.add(new Employee("Andrei", true, 16, "Tester"));
		employeList.add(new Employee("Aurel", false, 14, "Support"));

		try {
			new CompanyManagementSystem(employeList).operation();
			System.out.println(
					"========================================================================================================================");
			new InternalClassification(employeList).classification();

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
