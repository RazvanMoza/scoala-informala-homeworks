/**
 * The method in this class receives as input a string which is (km ,dm, m , cm, mm, foot, inch, miles) and then convers them into meters 
 */
package DistanceCalc;

public class OtherUnitToMetricConverter {
	
	public double unitConversionToMetric(String unit){
		double conv = 0;
		
		switch(unit){
		
		case "km": 	  conv = 1000; 		break;
		case "dm": 	  conv = 10; 		break;
		case "m" : 	  conv = 1; 		break;
		case "cm": 	  conv = 0.01; 		break;
		case "mm": 	  conv = 0.001; 	break;
		case "foot":  conv = 0.3048 ; 	break;
		case "inch":  conv = 0.0254; 	break;
		case "miles": conv = 1609.344;	break;
		default:System.out.println("Unit doesn't match"); break;
		}
	return conv;	
	}
}
