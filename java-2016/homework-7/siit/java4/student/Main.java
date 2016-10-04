/**
 * In the Main class are declared students and then processed with different methods.
 */
package siit.java4.student;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
	private static Logger LOGGER = Logger.getLogger(Main.class.getName());

	public static void main(String args[]) throws SecurityException, IOException {

		LOGGER.fine("In main");

		LOGGER.info("start main");

		try {
		
			StudentRepository sr = new StudentRepository();

			LOGGER.fine("before reading the students");
			sr.addStudent(new Student("Roger", "Federer", 1983, "Male", 1831014));
			sr.addStudent(new Student("Rafael", "Nadal", 1985, "male", 1851014));
			sr.addStudent(new Student("Novak", "Djokovici", 1987, "M", 1871014));
			sr.addStudent(new Student("Maria", "Sharapova", 1989, "Female", 2891014));
			sr.addStudent(new Student("Serena", "Whilliams", 1982, "female", 2821014));
			sr.addStudent(new Student("Simona", "Halep", 1992, "F", 2921014));
			LOGGER.fine("after reading the students");

			LOGGER.fine("before sorting the students by LastName");
			System.out.println(sr.orderStudentsByLastName());
			LOGGER.fine("after sorting the students by LastName");

			LOGGER.fine("before deleting a student");
			sr.deleteStudentByID(2821014);
			LOGGER.fine("after deleting a student");

			System.out.println("=================================================================================");

			LOGGER.fine("before sorting the students by Birth Date");
			System.out.println(sr.orderStudentsByBirthDate());
			LOGGER.fine("after sorting the students by Birth Date");

			System.out.println("=================================================================================");

			LOGGER.fine("before retrieving a student");
			System.out.println(sr.retreiveStudents(24));
			LOGGER.fine("after retrieving a student");

		} catch (ValidationException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			LOGGER.log(Level.INFO, "Error with inputs", e);
		}
		LOGGER.info("end main");
	}
}
