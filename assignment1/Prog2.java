/**
 * 
 */
package fpp.assignment1;

/**
 * @author 610488
 *
 */
public class Prog2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		float a =  1.27f;
		float b =  3.881f;
		float c = 	9.6f;

		// Sum of floats as an integer,obtained by casting the sum to type int
		float sum = a + b + c;
		System.out.println((int) sum);

		/*
		 * the sum of the floats as an integer, obtained by rounding the sum to the
		 * nearest integer, using the Math.round function
		 */
		int nearest = Math.round(sum);
		System.out.println(nearest);
		
		// Output: 14
		// 		   15
	}

}
