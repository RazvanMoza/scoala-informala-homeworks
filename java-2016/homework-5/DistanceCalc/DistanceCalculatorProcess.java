/**
 * The method receives 2 numbers and an operator which is (+ or -) and then sums or substract's the 2 numbers based on that operator
 */
package DistanceCalc;

public class DistanceCalculatorProcess {
	
	public double operation(double firstNumber,double secondNumber,String operator){
		double result=0;
		
		switch (operator){
		
		case "+": result = firstNumber + secondNumber;		break;
		case "-": result = firstNumber - secondNumber;		break;
		default:System.out.println("Operator not good");	break;
		}
		
		return result;
	}

}
