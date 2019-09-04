/**
 * 
 */
package fpp.assignment1;

/**
 * @author 610488
 *
 */
public class Prog1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// get a random number x in the range 1 .. 9 and compute πx
		int x = RandomNumbers.getRandomInt(1,9);
        System.out.println("Task 1: "+Math.round(Math.pow(Math.PI,x)));
        
        // get a random number y in the range 3 .. 14 and compute yπ
        int y = RandomNumbers.getRandomInt(3,14);
        System.out.println("Task 2: "+Math.round(Math.pow(y,Math.PI)));
        
        
        // Output
        // Task 1: 97
        // Task 2: 1385
        

	}

}
