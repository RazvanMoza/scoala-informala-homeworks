package siit.java4.salariescomputation;

import java.io.*;
import java.util.ArrayList;

/**
 * The Class Main.
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws ManagerException the manager exception
	 */
	public static void main(String[] args) throws ManagerException {

		String fileName = "src/siit/java4/salariescomputation/sales-team.txt";
		ArrayList<Person> personList = new ArrayList<>();
		SalaryCalculator salaryCalculator = new SalaryCalculator();
		LineFragmenter lineFragmenter = new LineFragmenter();

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
			String currentLine;

			while ((currentLine = bufferedReader.readLine()) != null) {
				Person p = lineFragmenter.fragmenter(currentLine);
				personList.add(p);
			}
			personList = salaryCalculator.salaryCalculator(personList);

			for (Person p : personList) {
				System.out.println(p.name + " " + p.salary);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
