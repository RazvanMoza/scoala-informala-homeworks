/**
 * The CompanyManagementSystem class receives an ArrayList as input and creates a TreeSet list whit the employees that don't have a parking 
 * space based on their seniority
 */
package siit.java4.cms;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class CompanyManagementSystem {

	ArrayList<Employee> newEmployeList;
	TreeSet<Employee> listSortedByParckingSpace = new TreeSet<>(new SeniorityComparator());
	List<Employee> managers = new ArrayList<>();
	List<Employee> developers = new ArrayList<>();
	List<Employee> testers = new ArrayList<>();
	List<Employee> support = new ArrayList<>();
	List<Employee> returnList = new ArrayList<>();

	public CompanyManagementSystem(ArrayList<Employee> employeList) {

		newEmployeList = employeList;
	}

	public TreeSet<Employee> operation() throws CMSException {
		if (newEmployeList.isEmpty()) {
			throw new CMSException("The list is empty");
		} else {
			for (Employee e : newEmployeList) {
				if (e.getSeniority() < 0) {
					throw new IllegalArgumentException("Seniority is not good");
				}
				if (!e.isParkingSpace()) {
					listSortedByParckingSpace.add(e);
				}
			}
			return listSortedByParckingSpace;
		}
	}

	public void classification() throws CMSException {
		if (newEmployeList.isEmpty()) {
			throw new CMSException("The list is empty");
		} else {
			for (Employee e : newEmployeList) {

				switch (e.getRole()) {
				case "Manager":
					managers.add(e);
					break;
				case "Developer":
					developers.add(e);
					break;
				case "Tester":
					testers.add(e);
					break;
				case "Support":
					support.add(e);
					break;
				default:
					throw new CMSException("No employee with this job qualification" + " " + e.getRole());

				}

			}

		}
	}

	public List<Employee> returnList(String function) throws CMSException {

		switch (function) {
		case "Managers":
			returnList = managers;
			break;
		case "Developers":
			returnList = developers;
			break;
		case "Testers":
			returnList = testers;
			break;
		case "Support":
			returnList = support;
			break;
		default:
			throw new CMSException("No such list exists");

		}
		return returnList;
	}
}
