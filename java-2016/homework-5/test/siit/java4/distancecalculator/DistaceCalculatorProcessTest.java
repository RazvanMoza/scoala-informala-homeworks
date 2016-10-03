package test.siit.java4.distancecalculator;

import org.junit.Test;

import siit.java4.distancecalc.DistanceCalculatorProcess;
import siit.java4.distancecalc.UnknownDistanceFormatException;

import static org.junit.Assert.*;

public class DistaceCalculatorProcessTest {
	
	@Test
	public void addCheck() throws UnknownDistanceFormatException {
		// given
		DistanceCalculatorProcess op = new DistanceCalculatorProcess();
		// when
		double result = op.operation(5.0, 3.0, "+");
		//then
		assertEquals(8.0, result,0);
	}
	
	@Test
	public void substractCheck() throws UnknownDistanceFormatException {
		// given
		DistanceCalculatorProcess op = new DistanceCalculatorProcess();
		// when
		double result = op.operation(5.0, 3.0, "-");
		//then
		assertEquals(2.0, result,0);
	}
	
}
