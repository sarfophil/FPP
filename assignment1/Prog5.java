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
		// Initialize a multidimensional Array
		int[][] numbers = new int[4][4];

		String top = "", down = "", line = "";
		String top1 = "", down1 = "", line1 = "";

		int count = 0;
		for (int i = 0; i < numbers.length; i++) {

			// Initialize array for each index item
			int[] values = new int[4];

			// loop through values and assign random integers
			for (int y = 0; y < values.length; y++) {
				// assigning random generated integers to values.
				values[y] = RandomNumbers.getRandomInt(1, 99);
			}

			// Assign values to numbers at current position
			numbers[i] = values;
		}

		// Loop through values and display values
		for (int x = 0; x < numbers.length; x++) {
			for (int e = 0; e < numbers[x].length - 1; e += 2) {
				if (count < 4) {
					// Top values
					top += String.format(" %3d\t\t", numbers[x][e]);
					down += String.format("+%3d\t\t", numbers[x][e + 1]);
					line += "_____\t\t";
				} else {
					// Bottom values
					top1 += String.format(" %3d\t\t", numbers[x][e]);
					down1 += String.format("+%3d \t\t", numbers[x][e + 1]);
					line1 += "_____\t\t";

				}
				count++;
			}

		}

		System.out.println(top + "\n" + down + "\n \n" + line + " \n \n");
		System.out.println(top1 + "\n" + down1 + "\n \n" + line1);
		
//		Output
//		  25		  23		  31		  94		
//		  + 54		+ 96		+ 68		+  8		
//		   
//		  _____		_____		_____		_____		 
//		   
//
//		    52		  23		  55		  65		
//		  + 80 		+ 67 		+  6 		+ 55 		
//		   
//		  _____		_____		_____		_____	

	}

}
