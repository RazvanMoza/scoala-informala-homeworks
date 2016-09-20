/**
 * The CompanyManagementSystem class receives an ArrayList as input and creates a TreeSet list whit the employees that don't have a parking 
 * space based on their seniority
 */
package CMS;

import java.util.ArrayList;
import java.util.TreeSet;

public class CompanyManagementSystem {

	ArrayList<Employee> EmployeList;
	TreeSet<Employee> list = new TreeSet<Employee>(new SeniorityComparator());

	public CompanyManagementSystem(ArrayList<Employee> employeList) {

		EmployeList = employeList;
	}

	public TreeSet<Employee> operation() throws CMSException {
		if (EmployeList.isEmpty()) {
			throw new CMSException("The list is empty");
		} else {
			for (Employee e : EmployeList) {
				if (e.getSeniority() < 0) {
					throw new IllegalArgumentException("Seniority is not good");
				}
				if (e.isParkingSpace() == false) {
					list.add(e);
				}
			}

			for (Employee en : list) {
				System.out.println(en);
			}
			return list;
		}
	}
}
