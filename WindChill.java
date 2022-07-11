/*Program that takes two double command-line arguments t and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the National Weather Service defines the effective temperature
(the wind chill) to be
35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16)       */

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
	double t, v;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Temperature(t) value:");
	t = sc.nextDouble();
	System.out.println("Enter Speed(v) value:");
	v = sc.nextDouble();
	
    double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
    System.out.println("Temperature = " + t + " F");
    System.out.println("Wind speed  = " + v + " miles/hour");
    System.out.println("Wind chill  = " + w);
    sc.close();
	}
}