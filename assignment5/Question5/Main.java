/**
 * 
 */
package demoine;

/**
 * @author SARFO PHILIP
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Computer comp1 = new Computer("Dell","1.2GHZ",23,45.0);
		Computer comp2 = new Computer("Dell","1.2GHZ",23,45.0);
		
		System.out.println(comp1.equals(comp2));

	}

}
