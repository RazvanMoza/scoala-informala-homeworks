package DistanceCalc;

import org.junit.Test;
import static org.junit.Assert.*;

public class DistanceCalculatorTest {

	@Test
	public void distanceCalculatorWorksWithCorrectInput() throws UnknownDistanceFormatException {
		
		String s = "25miles+15km+300m=";
		DistanceCalculator DC = new DistanceCalculator();
		double result = DC.stringConverter(s,"m");
		assertEquals(55534.0, result,0);		
	}
	
	@Test
	public void distanceCalculatorWorksWithNegativeFirstNumber() throws UnknownDistanceFormatException {
		
		String s = "-0.5miles+15km+300m=";
		DistanceCalculator DC = new DistanceCalculator();
		double result = DC.stringConverter(s,"m");
		assertEquals(16105.0, result,0);		
	}
	
	
	@Test(expected=UnknownDistanceFormatException.class)
	public void operationFailsWhithUnknownCharacters() throws UnknownDistanceFormatException {
		DistanceCalculator op = new DistanceCalculator();
		op.stringConverter("*","m");
	}
}
