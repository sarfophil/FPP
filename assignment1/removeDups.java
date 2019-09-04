/**
 * 
 */
package fpp.assignment1;

import java.util.Arrays;

/**
 * @author 610488
 *
 */
public class removeDups {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] inputs = { "horse", "dog", "cat", "horse", "dog" };

		String[] temp = new String[inputs.length];
		int count = 0;
		for (int i = 0; i < inputs.length; i++) {
			
			// If inputs at current position is not null
			if (inputs[i] != null) {
				for (int j = i + 1; j < inputs.length; j++) {
					
					// If inputs match,value at current position becomes null
					if (inputs[i] == inputs[j]) {
						inputs[j] = null;
						
						// Count number of duplicates
						count++;
					}
					
					//Else add values to temp array
					temp[i] = inputs[j];
				}
			}

		}

		String[] filteredInputs = new String[inputs.length - count];
		// Remove null values from array
		for (int k = 0; k < filteredInputs.length; k++) {
			filteredInputs[k] = inputs[k];
		}

		System.out.println(Arrays.toString(filteredInputs));
	}

}
