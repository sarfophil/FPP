/**
 * 
 */
package fpp.assignment1;

import java.util.Scanner;

/**
 * @author 610488
 *
 */
public class Prog4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Prompt user to input a string
		System.out.print("Please input a String: ");
		
		// Input value
		String input = scanner.nextLine();
		
		// declare a primitive string variable to accept the reversed characters
		String reversedInput = "";

		// loop through the input string starting from the last character
		// i = input.length() - 1 to eliminate indexOutOfBoundException
		for (int i = input.length() - 1; i >= 0; i--) {
			// Concatenate each character to reversedInput
			reversedInput += input.charAt(i);
		}

		// Output results here
		System.out.println("Reversed Input is " + reversedInput);
		scanner.close();

		
		/* Output:
		 * Please input a String: hello
		 *  Reversed Input is olleh
		 * */
	}

}
