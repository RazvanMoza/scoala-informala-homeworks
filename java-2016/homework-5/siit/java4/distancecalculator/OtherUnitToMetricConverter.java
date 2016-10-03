/**
 * The method in this class receives as input a string which is (km ,dm, m , cm, mm, foot, inch, miles) and then convers them into meters 
 */
package siit.java4.distancecalculator;

public class OtherUnitToMetricConverter {

	public double unitConversionToMetric(String unit) {
		double conversion = 0;

		switch (unit) {

		case "km":
			conversion = 1000;
			break;
		case "dm":
			conversion = 10;
			break;
		case "m":
			conversion = 1;
			break;
		case "cm":
			conversion = 0.01;
			break;
		case "mm":
			conversion = 0.001;
			break;
		case "foot":
			conversion = 0.3048;
			break;
		case "inch":
			conversion = 0.0254;
			break;
		case "miles":
			conversion = 1609.344;
			break;
		default:
			System.out.println("Unit doesn't match");
			break;
		}
		return conversion;
	}
}
