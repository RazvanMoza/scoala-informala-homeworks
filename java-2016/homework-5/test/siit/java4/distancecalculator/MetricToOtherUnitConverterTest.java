package test.siit.java4.distancecalculator;

import org.junit.Test;

import siit.java4.distancecalc.MetricToOtherUnitConverter;
import siit.java4.distancecalc.UnknownDistanceFormatException;

import static org.junit.Assert.*;

public class MetricToOtherUnitConverterTest {

	@Test
	public void kmCheck() throws UnknownDistanceFormatException {
		// given
		MetricToOtherUnitConverter op = new MetricToOtherUnitConverter();
		// when
		double result = op.metricToOtherUnit("km",15000.0);
		//then
		assertEquals(15, result,0);
	}
	
	@Test
	public void dmCheck() throws UnknownDistanceFormatException {
		// given
		MetricToOtherUnitConverter op = new MetricToOtherUnitConverter();
		// when
		double result = op.metricToOtherUnit("dm",1000.0);
		//then
		assertEquals(100, result,0);
	}
	
	@Test
	public void mCheck() throws UnknownDistanceFormatException {
		// given
		MetricToOtherUnitConverter op = new MetricToOtherUnitConverter();
		// when
		double result = op.metricToOtherUnit("m",15000.0);
		//then
		assertEquals(15000, result,0);
	}
	
	@Test
	public void cmCheck() throws UnknownDistanceFormatException {
		// given
		MetricToOtherUnitConverter op = new MetricToOtherUnitConverter();
		// when
		double result = op.metricToOtherUnit("cm",10.0);
		//then
		assertEquals(1000, result,0);
	}
	
	@Test
	public void mmCheck() throws UnknownDistanceFormatException {
		// given
		MetricToOtherUnitConverter op = new MetricToOtherUnitConverter();
		// when
		double result = op.metricToOtherUnit("mm",1.0);
		//then
		assertEquals(1000, result,0);
	}
	
	@Test
	public void footCheck() throws UnknownDistanceFormatException {
		// given
		MetricToOtherUnitConverter op = new MetricToOtherUnitConverter();
		// when
		double result = op.metricToOtherUnit("foot",3048.0);
		//then
		assertEquals(10000, result,0);
	}
	
	@Test
	public void inchCheck() throws UnknownDistanceFormatException {
		// given
		MetricToOtherUnitConverter op = new MetricToOtherUnitConverter();
		// when
		double result = op.metricToOtherUnit("inch",254.0);
		//then
		assertEquals(10000, result,0);
	}
	
	@Test
	public void milesCheck() throws UnknownDistanceFormatException {
		// given
		MetricToOtherUnitConverter op = new MetricToOtherUnitConverter();
		// when
		double result = op.metricToOtherUnit("miles",16093.0);
		//then
		assertEquals(10, result,0);
	}
	
}
