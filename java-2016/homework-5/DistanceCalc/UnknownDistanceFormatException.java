/**
 * Exception for when something in string is not good.
 */
package DistanceCalc;

public class UnknownDistanceFormatException extends Exception {

	public UnknownDistanceFormatException(String message) {
		super(message);
	}

}