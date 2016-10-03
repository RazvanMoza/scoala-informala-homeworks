package test.siit.java4.distancecalc;

import static org.junit.Assert.*;
import org.junit.Test;

import siit.java4.distancecalc.DistanceCalculator;
import siit.java4.distancecalc.MetricToOtherUnitConverter;
import siit.java4.distancecalc.UnknownDistanceFormatException;


public class DistanceCalculatorIntegrationTest {

	@Test
	public void distanceCalculatorWorksWithCorrectInput() throws UnknownDistanceFormatException {
		// given
		String s = "25miles+15km+300m=";
		DistanceCalculator DC = new DistanceCalculator();
		// when
		double result = DC.stringConverter(s,"m");
		// then
		MetricToOtherUnitConverter exp = new MetricToOtherUnitConverter();
		double expected = exp.metricToOtherUnit("m",55534.0);
		
		assertEquals(expected, result,0);		
	}
}
