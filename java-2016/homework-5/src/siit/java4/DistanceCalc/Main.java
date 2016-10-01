/**
 * In the main method receives from the user an expression composed of different distances with different units and the unit in which the user 
 * whant's the output.The result will be rounded up.
 */
package DistanceCalc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws UnknownDistanceFormatException {

		Scanner key = new Scanner(System.in);

		System.out.print("Write the operation you want to process = ");
		String expression = key.nextLine();

		System.out.print("In what unit do you want the output? = ");
		String outputUnit = key.nextLine();

		DistanceCalculator distanceConverter = new DistanceCalculator();
		double distance = distanceConverter.stringConverter(expression, outputUnit);

		System.out.println("The computed distances are:" + distance + " " + outputUnit);
		key.close();
	}
}
