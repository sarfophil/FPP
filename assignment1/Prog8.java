/**
 * 
 */
package fpp.assignment1;

/**
 * @author 610488
 *
 */
public class Prog8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] inputs = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};

        int min = 0;
        for (int input : inputs){
            if(min > input)
                min = input;
        }

        System.out.println(min);
        
//        Output : -21

	}

}
