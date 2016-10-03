/**
 * Exception for when something in string is not good.
 */
package siit.java4.distancecalc;

public class UnknownDistanceFormatException extends Exception {

	public UnknownDistanceFormatException(String message) {
		super(message);
	}

}