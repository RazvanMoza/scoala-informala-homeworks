package siit.java4.salariescomputation;

/**
 * The Class Person.
 */
public class Person {
	
	/** The name. */
	String name;
	
	/** The position. */
	String position;
	
	/** The nr of houers worked. */
	int nrOfHouersWorked;
	
	/** The nr of days off. */
	int nrOfDaysOff;
	
	/** The nr of prepaid sales. */
	int nrOfPrepaidSales;
	
	/** The nr of postpaid sales. */
	int nrOfPostpaidSales;
	
	/** The salary. */
	int salary;

	/**
	 * Instantiates a new person.
	 *
	 * @param name the name
	 * @param position the position
	 * @param nrOfHouersWorked the nr of houers worked
	 * @param nrOfDaysOff the nr of days off
	 * @param nrOfPrepaidSales the nr of prepaid sales
	 * @param nrOfPostpaidSales the nr of postpaid sales
	 * @param salary the salary
	 */
	public Person(String name, String position, int nrOfHouersWorked, int nrOfDaysOff, int nrOfPrepaidSales,
			int nrOfPostpaidSales, int salary) {

		this.name = name;
		this.position = position;
		this.nrOfHouersWorked = nrOfHouersWorked;
		this.nrOfDaysOff = nrOfDaysOff;
		this.nrOfPrepaidSales = nrOfPrepaidSales;
		this.nrOfPostpaidSales = nrOfPostpaidSales;
		this.salary = salary;
	}

	/** 
	 * Instantiates the toString() for the Person
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", position=" + position + ", nrOfHouersWorked=" + nrOfHouersWorked
				+ ", nrOfDaysOff=" + nrOfDaysOff + ", nrOfPrepaidSales=" + nrOfPrepaidSales + ", nrOfPostpaidSales="
				+ nrOfPostpaidSales + ", salary=" + salary + "]";
	}

	/** 
	 * Instantiates the hashCode() for the Person 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + nrOfDaysOff;
		result = prime * result + nrOfHouersWorked;
		result = prime * result + nrOfPostpaidSales;
		result = prime * result + nrOfPrepaidSales;
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + salary;
		return result;
	}

	/**
	 * Instantiates the equals() for the Person 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nrOfDaysOff != other.nrOfDaysOff)
			return false;
		if (nrOfHouersWorked != other.nrOfHouersWorked)
			return false;
		if (nrOfPostpaidSales != other.nrOfPostpaidSales)
			return false;
		if (nrOfPrepaidSales != other.nrOfPrepaidSales)
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
}
