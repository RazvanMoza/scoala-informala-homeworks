package test.siit.java4.student;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.TreeSet;
import org.junit.Test;

import siit.java4.student.Student;
import siit.java4.student.StudentComparatorByBirthDate;
import siit.java4.student.StudentComparatorByLastName;
import siit.java4.student.StudentRepository;
import siit.java4.student.ValidationException;

public class StudentRepositiryUnitTests {

	@Test
	public void correctAddOfStudents() throws ValidationException {

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("Roger", "Federer", 1983, "Male", 1831014));

		StudentRepository O = new StudentRepository();
		O.addStudent(new Student("Roger", "Federer", 1983, "Male", 1831014));

		assertEquals(list, O.students);
	}

	@Test(expected = ValidationException.class)
	public void addStudentWrongYear() throws ValidationException {

		StudentRepository O = new StudentRepository();
		O.addStudent(new Student("Roger", "Federer", 1883, "Male", 1831014));
	}

	@Test(expected = ValidationException.class)
	public void addStudentNameNotComplete() throws ValidationException {

		StudentRepository O = new StudentRepository();
		O.addStudent(new Student("Roger", "", 1983, "Male", 1831014));
	}

	@Test(expected = ValidationException.class)
	public void addStudentIDNotGood() throws ValidationException {

		StudentRepository O = new StudentRepository();
		O.addStudent(new Student("Roger", "Federer", 1883, "Male", 183101));
	}

	@Test(expected = ValidationException.class)
	public void addStudentGenderNotGood() throws ValidationException {

		StudentRepository O = new StudentRepository();
		O.addStudent(new Student("Roger", "Federer", 1983, "x", 1831014));
	}

	@Test
	public void deleteStudent() throws ValidationException {

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("Roger", "Federer", 1983, "Male", 1831014));

		StudentRepository O = new StudentRepository();
		O.addStudent(new Student("Roger", "Federer", 1983, "Male", 1831014));
		O.addStudent(new Student("Novak", "Djokovici", 1987, "Male", 1871014));

		O.deleteStudentByID(1871014);

		assertEquals(list, O.students);
	}

	@Test(expected = ValidationException.class)
	public void deleteStudenWrongID() throws ValidationException {

		StudentRepository O = new StudentRepository();
		O.deleteStudentByID(1851014);
	}

	@Test(expected = ValidationException.class)
	public void deleteStudentDifferentID() throws ValidationException {

		StudentRepository O = new StudentRepository();
		O.addStudent(new Student("Roger", "Federer", 1983, "Male", 1831014));
		O.addStudent(new Student("Novak", "Djokovici", 1987, "Male", 1871014));

		O.deleteStudentByID(1851014);
	}

	@Test
	public void retrieveStudent() throws ValidationException {

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("Roger", "Federer", 1983, "Male", 1831014));

		StudentRepository O = new StudentRepository();
		O.addStudent(new Student("Roger", "Federer", 1983, "Male", 1831014));
		O.addStudent(new Student("Novak", "Djokovici", 1985, "Male", 1851014));

		O.retreiveStudents(33);
		assertEquals(list, O.studentsRetrievedByCertainAge);
	}

	@Test(expected = ValidationException.class)
	public void retrieveStudentAgeNotGood() throws ValidationException {

		StudentRepository O = new StudentRepository();
		O.addStudent(new Student("Roger", "Federer", 1983, "Male", 1831014));
		O.addStudent(new Student("Novak", "Djokovici", 1987, "Male", 1871014));

		O.retreiveStudents(-10);
	}

	@Test(expected = ValidationException.class)
	public void retrieveStudentWrongAgeInput() throws ValidationException {

		StudentRepository O = new StudentRepository();
		O.addStudent(new Student("Roger", "Federer", 1983, "Male", 1831014));
		O.addStudent(new Student("Novak", "Djokovici", 1987, "Male", 1871014));

		O.retreiveStudents(28);
	}

	@Test
	public void studentsOrderedByBirthDate() throws ValidationException {
		TreeSet<Student> list = new TreeSet<Student>(new StudentComparatorByBirthDate());
		list.add(new Student("Roger", "Federer", 1983, "Male", 1831014));
		list.add(new Student("Novak", "Djokovici", 1983, "Male", 1871014));

		StudentRepository O = new StudentRepository();
		O.addStudent(new Student("Roger", "Federer", 1983, "Male", 1831014));
		O.addStudent(new Student("Novak", "Djokovici", 1983, "Male", 1871014));

		assertEquals(list, O.orderStudentsByBirthDate());
	}

	@Test(expected = ValidationException.class)
	public void studentOrderByBirthDateEmptyList() throws ValidationException {

		StudentRepository O = new StudentRepository();
		O.orderStudentsByBirthDate();
	}

	@Test
	public void studentsOrderedByLastName() throws ValidationException {
		TreeSet<Student> list = new TreeSet<Student>(new StudentComparatorByLastName());
		list.add(new Student("Roger", "Federer", 1983, "Male", 1831014));
		list.add(new Student("Novak", "Federer", 1987, "Male", 1871014));

		StudentRepository O = new StudentRepository();
		O.addStudent(new Student("Roger", "Federer", 1983, "Male", 1831014));
		O.addStudent(new Student("Novak", "Federer", 1987, "Male", 1871014));

		assertEquals(list, O.orderStudentsByLastName());
	}

	@Test(expected = ValidationException.class)
	public void studentOrderByLastNameEmptyList() throws ValidationException {

		StudentRepository O = new StudentRepository();
		O.orderStudentsByLastName();
	}
}
