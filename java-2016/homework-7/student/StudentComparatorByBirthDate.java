/**
 * The StudentComparatorByBirthDate class compares two students by the date of birth.
 * It is used to sort a list with students.
 */
package student;

import java.util.Comparator;

public class StudentComparatorByBirthDate implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {

		if (s1.getDateOfBirth() == s2.getDateOfBirth()) {
			return 0;
		} else {
			if (s1.getDateOfBirth() > s2.getDateOfBirth()) {
				return 1;
			} else {
				return -1;
			}
		}
	}
}
