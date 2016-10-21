package siit.java4.distancecalculator;

import static org.junit.Assert.*;
import org.junit.Test;

import siit.java4.distancecalculator.DistanceCalc;
import siit.java4.distancecalculator.MetricToOtherUnitConverter;
import siit.java4.distancecalculator.UnknownDistanceFormatException;


public class DistanceCalculatorIntegrationTest {

	@Test
	public void distanceCalculatorWorksWithCorrectInput() throws UnknownDistanceFormatException {
		// given
		String s = "25miles+15km+300m=";
		DistanceCalc DC = new DistanceCalc();
		// when
		double result = DC.stringConverter(s,"m");
		// then
		MetricToOtherUnitConverter exp = new MetricToOtherUnitConverter();
		double expected = exp.metricToOtherUnit("m",55534.0);
		
		assertEquals(expected, result,0);		
	}
}
