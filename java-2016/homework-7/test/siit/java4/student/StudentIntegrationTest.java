package test.siit.java4.student;

import org.junit.Test;

import siit.java4.student.Student;
import siit.java4.student.StudentRepository;
import siit.java4.student.ValidationException;

public class StudentIntegrationTest {

	@Test
	public void processIsWorking() throws ValidationException {

		try {
			StudentRepository O = new StudentRepository();

			O.addStudent(new Student("Roger", "Federer", 1983, "Male", 1831014));
			O.addStudent(new Student("Rafael", "Nadal", 1985, "male", 1851014));
			O.addStudent(new Student("Novak", "Djokovici", 1987, "M", 1871014));
			O.addStudent(new Student("Maria", "Sharapova", 1989, "Female", 2891014));
			O.addStudent(new Student("Serena", "Whilliams", 1982, "female", 2821014));
			O.addStudent(new Student("Simona", "Halep", 1992, "F", 2921014));

			O.orderStudentsByLastName();
			O.deleteStudentByID(2821014);
			System.out.println("================================================");
			O.orderStudentsByBirthDate();
			System.out.println("=================================================");
			O.retreiveStudents(24);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
