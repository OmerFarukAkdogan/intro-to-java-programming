package Ch_02;

import java.util.Scanner;

/*
 * Reads Celsius in double value from the console and converts it to Fahrenheit
 */

/**
 * @author Harry G. Dulaney IV
 */
public class Exercise02_01 {
	public static void main(String[]args) {
		double Celsius; 
		double Fahrenheit;
		
		
		System.out.println("Enter degrees in Celsius");
		
		Scanner input = new Scanner(System.in);
		Celsius = input.nextDouble();
		
		
		
		Fahrenheit = (9.0/5.0 * Celsius + 32);
		
		System.out.println(Fahrenheit);
		
		
		
	}

}
