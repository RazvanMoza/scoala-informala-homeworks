/**
 * The class SeniorityComparator compares the seniority of the Employees within the EmployeeList , and sortes them based on the seniority  
 */
package siit.java4.cms;

import java.util.Comparator;

public class SeniorityComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		if ((e1.getSeniority() < 0) || (e2.getSeniority() < 0)) {
			throw new IllegalArgumentException("Seniority is not good");
		} else {
			if ((e1.getSeniority() == e2.getSeniority())) {
				int r=0;
				return r == 0 ? e1.name.compareTo(e2.name) : r;
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
