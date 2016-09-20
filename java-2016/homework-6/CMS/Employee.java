/**
 * The class Employee defines an employee by name, parcking space , seniority and role , and provides the getters for them.
 */
package CMS;

public class Employee {

	String name;
	boolean parkingSpace;
	int seniority;
	String role;

	public Employee(String name, boolean parkingSpace, int seniority, String role) {

		this.name = name;
		this.parkingSpace = parkingSpace;
		this.seniority = seniority;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public boolean isParkingSpace() {
		return parkingSpace;
	}

	public int getSeniority() {
		return seniority;
	}

	public String getRole() {
		return role;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", parkingSpace=" + parkingSpace + ", seniority=" + seniority + ", role="
				+ role + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (parkingSpace ? 1231 : 1237);
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + seniority;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (parkingSpace != other.parkingSpace)
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (seniority != other.seniority)
			return false;
		return true;
	}

}
