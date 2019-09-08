/**
 * 
 */
package problem32;

/**
 * @author SARFO PHILIP
 *
 */
public class Recursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Question 1
		sortPatch("aca", "bdf", 0, "");
		
		//Question 2
		System.out.println("Question 2: \n"+ minimum("akel",0,'a')+"\n");
		
		//Question 3
		int arr[] = {90,9,3,59,4,90,3,4,50,89};
		System.out.println("Question 3: \n"+ binarySearch(arr,59,0)+"\n");

		//Question 4
		System.out.println("Question 4: \n" + isPalindrome("bob",0)+"\n");

	}

	/**
	 * 1.Merge the two sorted string into a single sorted string. Note : Your input
	 * should be a sorted input string. Example : String1 = "ace" String2 = "bdf"
	 * Output : "abcdef"
	 * 
	 * @param String         1
	 * @param String         2
	 * @param count          = 0
	 * @param filterMerge=""
	 * 
	 **/
	static void sortPatch(String a, String b, int count, String filterMerge) {

		String merge = a + b;
		char[] arr = merge.toCharArray();
		int mergeLength = arr.length - count;

		if (mergeLength == 1) {
			System.out.println("Question 1\nOutput: " + filterMerge + "\n");
			return;
		}

		for (int i = 0; i < mergeLength - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				char temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		filterMerge = "";
		for (char v : arr)
			filterMerge += v;

		a = filterMerge.substring(0, filterMerge.length() / 2);
		b = filterMerge.substring(filterMerge.length() / 2, filterMerge.length());

		sortPatch(a, b, count + 1, filterMerge);

	}

	/**
	 * 2. Using recursion to find the minimum character in a given string input. If
	 * your input is "akel" in return ‘a’
	 * 
	 * @param String a
	 * @param int    count
	 * @param char   min = ""; First value in your string
	 */
	static char minimum(String a, int count, char min) {
		if (a.isEmpty())
			return 'a';
		char[] b = a.toCharArray();
		if (b.length == count) {
			return min;
		}
		if (b[count] < min) {
			min = b[count];
			count++;

		}
		count++;
		return minimum(a, count, min);
	}

	/**
	 * 3. Perform Recursive Binary Search.
	 * 
	 * @param int[] arr
	 * @param int   num
	 * @param int   index
	 */
	static boolean binarySearch(int[] arr, int num, int index) {
		if (arr.length == 0)
			return false;
		if (arr.length == index) {
			return false;
		} else if (arr[index] == num) {
			return true;
		} else {
			return binarySearch(arr, num, index + 1);
		}
	}

	/**
	 * 4.Check the given string input is palindrome or not.
	 * @param String text
	 * @param int count 
	 * 
	 */
	static boolean isPalindrome(String text,int count) {
		if(text.length() == count) {
			return false;
		}else if(text.charAt(count) == text.charAt(text.length()-1)) {	
			return true;
		}
		count++;
		return isPalindrome(text.substring(count,(text.length()-1)-count), count);
		
	}

}
