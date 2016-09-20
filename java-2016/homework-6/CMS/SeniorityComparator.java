/**
 * The class SeniorityComparator compares the seniority of the Employees within the EmployeeList , and sortes them based on the seniority  
 */
package CMS;

import java.util.Comparator;

public class SeniorityComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		if ((e1.getSeniority() < 0) || (e2.getSeniority() < 0)) {
			throw new IllegalArgumentException("Seniority is not good");
		} else {
			if (e1.getSeniority() == e2.getSeniority()) {
				return 0;
			} else {
				if (e1.getSeniority() > e2.getSeniority()) {
					return 1;
				} else {
					return -1;
				}
			}
		}
	}
}
