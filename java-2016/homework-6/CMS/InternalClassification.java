/**
 * The InternalClassification class receives an ArrayList as input and then creates separate ArrayList's based on the employee classification
 */
package CMS;

import java.util.ArrayList;
import java.util.List;

public class InternalClassification {

	ArrayList<Employee> EmployeList;
	List<Employee> Managers = new ArrayList<Employee>();
	List<Employee> Developers = new ArrayList<Employee>();
	List<Employee> Testers = new ArrayList<Employee>();
	List<Employee> Support = new ArrayList<Employee>();

	public InternalClassification(ArrayList<Employee> employeList) {

		EmployeList = employeList;
	}

	public void classification() throws CMSException {
		if (EmployeList.isEmpty()) {
			throw new CMSException("The list is empty");
		} else {
			for (Employee e : EmployeList) {

				switch (e.getRole()) {
				case "Manager":
					Managers.add(e);
					break;
				case "Developer":
					Developers.add(e);
					break;
				case "Tester":
					Testers.add(e);
					break;
				case "Support":
					Support.add(e);
					break;
				default:
					throw new CMSException("No employee with this job qualification" + " " + e.getRole());
				}

			}
			System.out.println("Managers:" + Managers);
			System.out.println("Developers:" + Developers);
			System.out.println("Testers:" + Testers);
			System.out.println("Support:" + Support);
		}
	}
}
