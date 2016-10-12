package siit.java4.salariescomputation;

import java.util.regex.Pattern;

/**
 * The Class LineFragmenter.
 */
public class LineFragmenter {
	
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

	/**
	 * Fragmenter.
	 *
	 * @param line the line
	 * @return the person
	 */
	public Person fragmenter(String line) {

		String[] output = line.split(Pattern.quote("|"));
		name = output[0];
		position = output[1];
		nrOfHouersWorked = Integer.parseInt(output[2]);
		nrOfDaysOff = Integer.parseInt(output[3]);
		if (output.length < 5) {
			nrOfPrepaidSales = 0;
		} else {
			nrOfPrepaidSales = Integer.parseInt(output[4]);
		}
		if (output.length < 6) {
			nrOfPostpaidSales = 0;
		} else {
			nrOfPostpaidSales = Integer.parseInt(output[5]);
		}

		return new Person(name, position, nrOfHouersWorked, nrOfDaysOff, nrOfPrepaidSales, nrOfPostpaidSales, 0);

	}
}
