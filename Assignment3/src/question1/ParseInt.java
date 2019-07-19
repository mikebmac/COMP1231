//**************************************************************************************************
// ParseInt.java
//
// Date: 	July 19th, 2019
// Author:	Michael MacKay T00625701
// Assignment: 3
//
// Driver class
//**************************************************************************************************
package question1;

import java.util.Scanner;

public class ParseInt {

	public static void main(String[] args) {
		System.out.println("This program will take 10 inputs and average them out.");
		double av = average(inputInts());
		System.out.println("\tAverage\n\t========\n\t" + av);
	}
	
	//----------------------------------------------------------------------------------------------
	// Takes in 10 integer inputs from the user, will not accept non-integer inputs
	//
	// Returns	String[] with length of 10 of validated integers
	//----------------------------------------------------------------------------------------------
	private static String[] inputInts() {
		Scanner scanner = new Scanner(System.in);
		String[] inputs = new String[10];
		
		int i = 0;
		while (i < 10) {
			System.out.println("\tEnter an Integer Number:");
			String t = scanner.nextLine();
			if (validateInt(t)) {
				inputs[i] = t;
				i++;
			}
		}
		
		scanner.close();
		
		return inputs;
	}
	
	//----------------------------------------------------------------------------------------------
	// Validates if the parameter string is an integer
	//
	// Returns	true  - if it is an integer
	//			false - if it is integer an integer
	//----------------------------------------------------------------------------------------------
	private static boolean validateInt(String string) {
		try {
			Integer.parseInt(string);
			return true;
		} catch (NumberFormatException exception) {
			System.out.println("\tNon-integer input:" + string);
		} catch (StringIndexOutOfBoundsException exception) {
			System.out.println("\tImproper Length:" + string.length());
		}
		return false;
	}
	
	//----------------------------------------------------------------------------------------------
	// Calculated the average of an array of strings, assumes the strings are validated
	//
	// Returns	Double average
	//----------------------------------------------------------------------------------------------
	private static double average(String[] strings) {
		double sum = 0;
		double divisor = (double)strings.length;
		
		for (int i = 0; i < strings.length; i++) {
			sum += Double.parseDouble(strings[i]);
		}
		
		return (sum / divisor);
	}
}
