/**
 * The method receives as input a string that represents the unit in which the user whant's the data to be displayed and a double which is the measurement in meters 
 * The final value will be rounded.
 */
package DistanceCalc;

public class MetricToOtherUnitConverter {
	
	public double metricToOtherUnit(String output,double finalResult){
		double conv=0;
		
		switch(output){
		
		case "km": 	  conv = Math.round(finalResult	/ 1000); 		break;
		case "dm": 	  conv = Math.round(finalResult	/ 10); 			break;
		case "m" : 	  conv = Math.round(finalResult / 1);			break;
		case "cm": 	  conv = Math.round(finalResult	/ 0.01); 		break;
		case "mm": 	  conv = Math.round(finalResult	/ 0.001);		break;
		case "foot":  conv = Math.round(finalResult	/ 0.3048);		break;
		case "inch":  conv = Math.round(finalResult	/ 0.0254);	 	break;
		case "miles": conv = Math.round(finalResult	/ 1609.344);	break;
		default:System.out.println("Unit doesn't match");			break;
	}
		return conv;
	}
}
