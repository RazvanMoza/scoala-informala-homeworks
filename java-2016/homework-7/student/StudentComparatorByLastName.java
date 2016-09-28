/**
 * The StudentComparatorByLastName class compares two students by their last Name.
 * It is used to sort a list with students.
 */
package student;

import java.util.Comparator;

public class StudentComparatorByLastName implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getLastName().compareTo(s2.getLastName());
	}
}
