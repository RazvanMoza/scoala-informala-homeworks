package siit.java4.salariescomputation;

import java.util.ArrayList;

/**
 * The Class SalaryCalculator.
 */
public class SalaryCalculator {

	/**
	 * The Enum SalaryAndBonus.
	 */
	public enum SalaryAndBonus {

		/** The manager salary. */
		managerSalary(40),
		/** The manager post paid bonnus. */
		managerPostPaidBonnus(30),
		/** The manager prepaid bonnus. */
		managerPrepaidBonnus(15),
		/** The sso salary. */
		ssoSalary(20),
		/** The sso post paid bonnus. */
		ssoPostPaidBonnus(50),
		/** The sso prepaid bonnus. */
		ssoPrepaidBonnus(25),
		/** The so salary. */
		soSalary(10),
		/** The so post paid bonnus. */
		soPostPaidBonnus(25),
		/** The so prepaid bonnus. */
		soPrepaidBonnus(10);

		/** The value. */
		int value;

		/**
		 * Instantiates a new salary and bonus.
		 *
		 * @param value
		 *            the value
		 */
		private SalaryAndBonus(int value) {
			this.value = value;
		}
	}

	/**
	 * Salary calculator.
	 *
	 * @param persons
	 *            the persons
	 * @return the array list
	 * @throws ManagerException
	 *             the manager exception
	 */
	public ArrayList<Person> salaryCalculator(ArrayList<Person> persons) throws ManagerException {
		int managerChecker = 0;
		int totalPostpaidSales = 0;
		int totalPrepaidSales = 0;

		for (Person p : persons) {

			if (p.position.equals("Senior Sales Officer")) {
				p.salary = seniorSalesOfficeSalaryCalculator(p.nrOfHouersWorked, p.nrOfDaysOff, p.nrOfPrepaidSales,
						p.nrOfPostpaidSales);
				totalPostpaidSales += p.nrOfPostpaidSales;
				totalPrepaidSales += p.nrOfPrepaidSales;
			}
			if (p.position.equals("Sales Officer")) {
				p.salary = salesOfficeSalaryCalculator(p.nrOfHouersWorked, p.nrOfDaysOff, p.nrOfPrepaidSales,
						p.nrOfPostpaidSales);
				totalPostpaidSales += p.nrOfPostpaidSales;
				totalPrepaidSales += p.nrOfPrepaidSales;
			}
		}

		for (Person p : persons) {
			if (p.position.equals("Sales Manager")) {
				p.salary = managerSalaryCalculator(p.nrOfHouersWorked, p.nrOfDaysOff, totalPrepaidSales,
						totalPostpaidSales);
				managerChecker++;
			}
		}

		if (managerChecker != 1) {
			throw new ManagerException("Problems with Managers in the list");
		}
		return persons;
	}

	/**
	 * Manager salary calculator.
	 *
	 * @param managerHoursWorked
	 *            the manager hours worked
	 * @param managerNrOfDaysOff
	 *            the manager nr of days off
	 * @param totalPrepaidSales
	 *            the total prepaid sales
	 * @param totalPostpaidSales
	 *            the total postpaid sales
	 * @return the int
	 */
	public int managerSalaryCalculator(int managerHoursWorked, int managerNrOfDaysOff, int totalPrepaidSales,
			int totalPostpaidSales) {
		int salary = 0;
		salary = SalaryAndBonus.managerSalary.value * managerHoursWorked
				+ SalaryAndBonus.managerSalary.value * 8 * managerNrOfDaysOff
				+ SalaryAndBonus.managerPostPaidBonnus.value * totalPostpaidSales
				+ SalaryAndBonus.managerPrepaidBonnus.value * totalPrepaidSales;

		return salary;
	}

	/**
	 * Senior sales office salary calculator.
	 *
	 * @param workedHours
	 *            the worked hours
	 * @param daysOff
	 *            the days off
	 * @param prepaidSales
	 *            the prepaid sales
	 * @param postpaidSales
	 *            the postpaid sales
	 * @return the int
	 */
	public int seniorSalesOfficeSalaryCalculator(int workedHours, int daysOff, int prepaidSales, int postpaidSales) {
		int salary = 0;
		salary = SalaryAndBonus.ssoSalary.value * workedHours + SalaryAndBonus.ssoSalary.value * 8 * daysOff
				+ SalaryAndBonus.ssoPrepaidBonnus.value * prepaidSales
				+ SalaryAndBonus.ssoPostPaidBonnus.value * postpaidSales;

		return salary;
	}

	/**
	 * Sales office salary calculator.
	 *
	 * @param workedHours
	 *            the worked hours
	 * @param daysOff
	 *            the days off
	 * @param prepaidSales
	 *            the prepaid sales
	 * @param postpaidSales
	 *            the postpaid sales
	 * @return the int
	 */
	public int salesOfficeSalaryCalculator(int workedHours, int daysOff, int prepaidSales, int postpaidSales) {
		int salary = 0;
		salary = SalaryAndBonus.soSalary.value * workedHours + SalaryAndBonus.soSalary.value * 8 * daysOff
				+ SalaryAndBonus.soPrepaidBonnus.value * prepaidSales
				+ SalaryAndBonus.soPostPaidBonnus.value * postpaidSales;

		return salary;
	}

}
