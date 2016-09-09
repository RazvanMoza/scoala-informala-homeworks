/**
 * In the stringConverter method receives a expression composed of different distances and the unit which he want's the output.
 * The expression must end with an "=" character
 */
package DistanceCalc;

public class DistanceCalculator {
	
	public double stringConverter(String expression,String outputUnit) throws UnknownDistanceFormatException{
		
	char[] expresionArray = expression.toCharArray();
	boolean bol 		= false;
	String number 		= null;
	String unit 		= null;
	String operator 	= null;
	double finalResult	= 0;
	int c=1;
	
	for(int i=0;i<expresionArray.length;i++){
		
		if((Character.toString(expresionArray[i]).matches("[*]"))||(Character.toString(expresionArray[i]).matches("[/]"))||
		  (Character.toString(expresionArray[i]).matches("[_]"))||(Character.toString(expresionArray[i]).matches("[)]"))||
		  (Character.toString(expresionArray[i]).matches("[(]"))){
			throw new UnknownDistanceFormatException("Expression not good");
		}
		
		// This IF detects if first number is negative.
		if((i==0)&&(Character.toString(expresionArray[i]).matches("[-]"))){
			c = -1;
		}
		
		// This IF detects a number or a . in the array of characters and makes a string of that numbers
		if (Character.isDigit(expresionArray[i])||(Character.toString(expresionArray[i]).matches("[.]"))){
			if (number == null){
				number = Character.toString(expresionArray[i]);
			}else{
			number = number + expresionArray[i];
				}
		}
		
		// This IF detects a letter in the array of characters and makes a string of that letters
		if(Character.isLetter(expresionArray[i])){
			if (unit == null){
				unit = Character.toString(expresionArray[i]);
			}else{
			unit = unit + expresionArray[i];
				}
		}
		
		// This IF detects once a group of numbers and letters have finished (Ex: 12miles) and converts the numbers into a double,
		//the letters into a double based on the conversion class, multiplies the two , and based on the operator sums or substract's
		// with the next group
		if(i>0){
			if(!Character.isDigit(expresionArray[i])&&(!Character.isLetter(expresionArray[i]))&&(Character.isLetter(expresionArray[i-1]))){
			double result=0;
			OtherUnitToMetricConverter conversion = new OtherUnitToMetricConverter();
			double a = Double.parseDouble(number);
			number = null;
			double b = conversion.unitConversionToMetric(unit);
			unit = null;
			result = a*b*c;
			c = 1;
			if(bol){
				DistanceCalculatorProcess process = new DistanceCalculatorProcess();
				finalResult = process.operation(finalResult,result,operator);
					
			}else{
				finalResult=result;
				
			}
		   }
		}
		
		
		// This IF detects an operator (+ or -) in the array of characters and then put's  that value in a string called operator
		if((Character.toString(expresionArray[i]).matches("[+]"))||(Character.toString(expresionArray[i]).matches("[-]")) ){
			operator = Character.toString(expresionArray[i]);
			bol = true;
			
		}
		
	  }
	
	MetricToOtherUnitConverter convert = new MetricToOtherUnitConverter();
	double distance = convert.metricToOtherUnit(outputUnit,finalResult);
	
	return distance;
	}
}
