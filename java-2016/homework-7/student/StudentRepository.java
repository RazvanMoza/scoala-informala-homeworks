/**
 * In the Operations class , we have the following methods: addStudent, delete student provided an ID, list the 
 * students by birth date , last name and retrieving a student with a specific age.
 * For all the methods there are specific exceptions for the input fields.  
 */
package student;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.TreeSet;

public class StudentRepository {

	ArrayList<Student> students = new ArrayList<Student>();
	TreeSet<Student> studentsOrderByBirthDate = new TreeSet<Student>(new StudentComparatorByBirthDate());
	TreeSet<Student> studentsOrderByLastName = new TreeSet<Student>(new StudentComparatorByLastName());
	ArrayList<Student> toRemove = new ArrayList<Student>();
	ArrayList<Student> studentsRetrievedByCertainAge = new ArrayList<Student>();

	public void addStudent(Student s) throws ValidationException {

		int length = (int) (Math.log10(s.getID()) + 1);
		int year = Calendar.getInstance().get(Calendar.YEAR);

		if ((s.getDateOfBirth() < 1900) || (s.getDateOfBirth() > year - 18)) {
			throw new ValidationException("The year is not good");
		}
		if ((s.getFirstName() == null) || (s.getLastName() == null) || (s.getLastName() == "")
				|| (s.getFirstName() == "")) {
			throw new ValidationException("The name is not complete");
		}
		if (length != 7) {
			throw new ValidationException("The ID is not good");
		}
		if ((s.getGender().equalsIgnoreCase("male")) || (s.getGender().equalsIgnoreCase("female"))
				|| (s.getGender().equalsIgnoreCase("M")) || (s.getGender().equalsIgnoreCase("F"))) {
			students.add(s);
		} else {
			throw new ValidationException("Gender is not good");

		}

	}

	public void deleteStudentByID(int ID) throws ValidationException {

		int length = (int) (Math.log10(ID) + 1);
		boolean studentController = false;

		if ((ID == 0) || (length != 7)) {
			throw new ValidationException("The ID provided is not good");
		} else {
			for (Student s : students) {
				if (s.getID() == ID) {
					toRemove.add(s);
					studentController = true;
				}
			}
			if (studentController == false) {
				throw new ValidationException("Student with this ID does not exist");
			} else {
				students.removeAll(toRemove);
			}
		}

	}

	public ArrayList<Student> retreiveStudents(int age) throws ValidationException {
		boolean ageController = false;
		int year = Calendar.getInstance().get(Calendar.YEAR);

		if ((age < 0) || (age != (int) age)) {
			throw new ValidationException("Age is not good");
		} else {
			for (Student s : students) {
				if (year - s.getDateOfBirth() == age) {
					ageController = true;
					studentsRetrievedByCertainAge.add(s);
				}
			}
			if (ageController == false) {
				throw new ValidationException("No person with this age exists");
			}

		}
		return studentsRetrievedByCertainAge;
	}

	public TreeSet<Student> orderStudentsByBirthDate() throws ValidationException {
		if (students.isEmpty()) {
			throw new ValidationException("Input is empty");
		} else {
			for (Student s : students) {
				studentsOrderByBirthDate.add(s);
			}
		}
		return studentsOrderByBirthDate;
	}

	public TreeSet<Student> orderStudentsByLastName() throws ValidationException {
		if (students.isEmpty()) {
			throw new ValidationException("Input is empty");
		} else {
			for (Student s : students) {
				studentsOrderByLastName.add(s);
			}
		}
		return studentsOrderByLastName;
	}
}
