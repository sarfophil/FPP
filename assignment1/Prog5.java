/**
 * 
 */
package fpp.assignment1;

/**
 * @author SARFO PHILIP
 *
 */
public class Prog5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Initialize a multidimensional Array
		int[][] numbers = new int[4][4];
		
		for (int i = 0; i < numbers.length; i++) {
			
			//Initialize array for each index item
			int[] values = new int[4];
			
			//loop through values and assign random integers
			for (int y = 0; y < values.length; y++) {
				//assigning random generated integers to values.
				values[y] = RandomNumbers.getRandomInt(1, 99);
			}
			
			//Assign values to numbers at current position
			numbers[i] = values;
		}

		//Loop through values and display values
		for (int x = 0; x < numbers.length; x++) {
			for (int e = 0; e < numbers[x].length - 1; e += 2) {
				System.out.printf("  %3d \n", numbers[x][e]);
				System.out.printf("+ %3d \n", numbers[x][e + 1]);
				System.out.println("________\n");
			}
		}
		
		
		/*
		 *     11 
			+  26 
			________
			
			   46 
			+   9 
			________
			
			   95 
			+  58 
			________
			
			   76 
			+  24 
			________
			
			   47 
			+  73 
			________
			
			    9 
			+  90 
			________
			
			   17 
			+  12 
			________
			
			    8 
			+  11 
			________
		 */

		

	}

}
