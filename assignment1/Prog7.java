/**
 * 
 */
package fpp.assignment1;

/**
 * @author SARFO PHILIP
 *
 */
public class Prog7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//  Print the length of each string input.
        int count = 0;
        for(String input : args){
            System.out.println("Length of each of "+input+" is "+input.length());
            if(input.startsWith("A")){
                count++;
            }
        }
        System.out.println("String Input starting with 'A' : "+count);
        
//        Output
//        Length of each of Akwasi is 6
//        Length of each of Bayson is 6
//        Length of each of Phil is 4
//        Length of each of Ampon is 5
//        String Input starting with 'A' :2
	}

}
