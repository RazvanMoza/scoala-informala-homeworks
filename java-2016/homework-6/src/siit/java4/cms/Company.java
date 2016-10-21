/**
 * In the Company class it is created an ArrayList that is filled with employees.
 */
package siit.java4.cms;

import java.util.ArrayList;

public class Company {

	public static void main(String[] args) {

		ArrayList<Employee> employeList = new ArrayList<Employee>();

		employeList.add(new Employee("Razvan", true, 10, "Manager"));
		employeList.add(new Employee("Vlad", false, 20, "Developer"));
		employeList.add(new Employee("Mihai", false, 15, "Tester"));
		employeList.add(new Employee("Pit", true, 13, "Developer"));
		employeList.add(new Employee("Daniel", false, 5, "Support"));
		employeList.add(new Employee("Andrei", true, 16, "Tester"));
		employeList.add(new Employee("Aurel", false, 5, "Support"));

		try {
			CompanyManagementSystem cms = new CompanyManagementSystem(employeList);
			System.out.println(cms.operation());
			System.out.println(
					"========================================================================================================================");
			cms.classification();
			System.out.println(cms.returnList("Managers"));

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (CMSException f) {
			System.out.println(f.getMessage());
		}
	}
}
