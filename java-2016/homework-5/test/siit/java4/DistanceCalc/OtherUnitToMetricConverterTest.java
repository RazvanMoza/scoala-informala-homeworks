package test.siit.java4.distancecalc;

import org.junit.Test;

import siit.java4.distancecalc.OtherUnitToMetricConverter;
import siit.java4.distancecalc.UnknownDistanceFormatException;

import static org.junit.Assert.*;

public class OtherUnitToMetricConverterTest {
	
	@Test
	public void kmCheck() throws UnknownDistanceFormatException {
		// given
		OtherUnitToMetricConverter op = new OtherUnitToMetricConverter();
		// when
		double result = op.unitConversionToMetric("km");
		//then
		assertEquals(1000, result,0);
	}
	
	@Test
	public void dmCheck() throws UnknownDistanceFormatException {
		// given
		OtherUnitToMetricConverter op = new OtherUnitToMetricConverter();
		// when
		double result = op.unitConversionToMetric("dm");
		//then
		assertEquals(10, result,0);
	}
	
	@Test
	public void mCheck() throws UnknownDistanceFormatException {
		// given
		OtherUnitToMetricConverter op = new OtherUnitToMetricConverter();
		// when
		double result = op.unitConversionToMetric("m");
		//then
		assertEquals(1, result,0);
	}
	
	@Test
	public void cmCheck() throws UnknownDistanceFormatException {
		// given
		OtherUnitToMetricConverter op = new OtherUnitToMetricConverter();
		// when
		double result = op.unitConversionToMetric("cm");
		//then
		assertEquals(0.01, result,0);
	}
	
	@Test
	public void mmCheck() throws UnknownDistanceFormatException {
		// given
		OtherUnitToMetricConverter op = new OtherUnitToMetricConverter();
		// when
		double result = op.unitConversionToMetric("mm");
		//then
		assertEquals(0.001, result,0);
	}
	
	@Test
	public void footCheck() throws UnknownDistanceFormatException {
		// given
		OtherUnitToMetricConverter op = new OtherUnitToMetricConverter();
		// when
		double result = op.unitConversionToMetric("foot");
		//then
		assertEquals(0.3048, result,0);
	}
	
	@Test
	public void inchCheck() throws UnknownDistanceFormatException {
		// given
		OtherUnitToMetricConverter op = new OtherUnitToMetricConverter();
		// when
		double result = op.unitConversionToMetric("inch");
		//then
		assertEquals(0.0254, result,0);
	}
	
	@Test
	public void milesCheck() throws UnknownDistanceFormatException {
		// given
		OtherUnitToMetricConverter op = new OtherUnitToMetricConverter();
		// when
		double result = op.unitConversionToMetric("miles");
		//then
		assertEquals(1609.344, result,0);
	}
	
	
}
