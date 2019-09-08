/**
 * 
 */
package problem32;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author SARFO PHILIP
 *
 */
public class JunitCase {	
	
	@Test
	public void testQuestion2() {
		char minimumValue = Recursion.minimum("akel", 0, 'a');
		assertEquals('a',minimumValue);
	}
	
	@Test
	public void testQuestion3() {
		int arr[] = {90,9,3,59,4,90,3,4,50,89};
		boolean binarySearch = Recursion.binarySearch(arr, 4, 0);
		assertEquals(true,binarySearch);
	}
	

}
