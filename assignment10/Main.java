/**
 * 
 */
package assignment10;

/**
 * @author 610488
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BSTree mybst = new BSTree();

		int[] a = { 15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25 };

		for (int j = 0; j < a.length; j++) {
			mybst.insert(a[j]);

		}
		mybst.insert(25);
		mybst.preOrder();
		mybst.postOrder();
		mybst.printTree();
		System.out.println(mybst.leafNodes());

	}

}
