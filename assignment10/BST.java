/**
 * 
 */
package assignment10;

/**
 * @author 610488
 *
 */
public interface BST {
	public void insert(int value);

	public void printTree();

	public void preOrder();

	// private void preOrder(BinaryNode t)
	public void postOrder();

	// private void postOrder(BinaryNode t)
	public Boolean contains(Integer key);

	public Integer getRoot();

	public Integer leafNodes();

	// private int leafNodes(BinaryNode t)
	public int size();

	public boolean isEmpty();

	public Integer findMin();

	// private Integer findMin()
	public Integer findMax();
	// public Integer findMax(root)

}

class BSTree implements BST {
	private BinaryNode root;
	private int size;

	public BSTree() {
		root = null;
		size = -1;
	}

	@Override
	public void insert(int value) {
		if (root == null) {
			root = new BinaryNode(value);

		} else {
			BinaryNode leafNodes = leafNode(root, value);
			if (value < leafNodes.value) {
				leafNodes.left = new BinaryNode(value);
			} else {
				leafNodes.right = new BinaryNode(value);
			}
		}

		size++;
	}

	@Override
	public void printTree() {
		printTree(root);
	}
	
	// Inorder Traversal to print the nodes in Ascending order
	private void printTree(BinaryNode t) {
		if (t != null) {
			printTree(t.left);
			System.out.print(t.value + ",");
			printTree(t.right);
		}
	}

	@Override
	public void preOrder() {
		// TODO Auto-generated method stub

	}

	@Override
	public void postOrder() {
		// TODO Auto-generated method stub

	}

	@Override
	public Boolean contains(Integer key) {
		if (root == null)
			return false;
		if (root.value != key)
			return contains(root, key);
		return true;
	}

	private Boolean contains(BinaryNode binaryNode, Integer key) {
		if (binaryNode.left == null && binaryNode.right == null) {
			if (binaryNode.value == key)
				return true;
			return false;
		}
		if (key == binaryNode.value) {
			return true;
		} else if (key < binaryNode.value) {
			return contains(binaryNode.left, key);
		}
		return contains(binaryNode.right, key);

	}

	@Override
	public Integer getRoot() {
		return root.value;
	}

	@Override
	public Integer leafNodes() {
		return leafNodes(root);
	}

	private Integer leafNodes(BinaryNode binaryNode) {
		if (binaryNode.left == null && binaryNode.right == null)
			return binaryNode.value;
		return leafNodes(binaryNode.left);
	}

	private BinaryNode leafNode(BinaryNode binaryNode, int value) {
		if (binaryNode.left == null && binaryNode.right == null)
			return binaryNode;
		if (value > binaryNode.value)
			return leafNode(binaryNode.right, value);

		return leafNode(binaryNode.left, value);
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return (size == -1);
	}

	@Override
	public Integer findMin() {
		return findMin(root);
	}

	private Integer findMin(BinaryNode binaryNode) {
		if(binaryNode.left == null)
			return binaryNode.value;
		return findMin(binaryNode.left);
	}

	@Override
	public Integer findMax() {
		return findMax(root);
	}
	
	private Integer findMax(BinaryNode binaryNode) {
		if(binaryNode.right == null)
			return binaryNode.value;
		return findMax(binaryNode.right);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BSTree mybst = new BSTree();

		int[] a = { 15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25 };

		for (int j = 0; j < a.length; j++) {
			mybst.insert(a[j]);

		}
		mybst.insert(12);
		mybst.printTree();

	}

	private class BinaryNode {
		private Integer value;
		private BinaryNode left;
		private BinaryNode right;

		public BinaryNode(Integer value) {
			this(null, value, null);
		}

		public BinaryNode(BinaryNode left, Integer value, BinaryNode right) {
			this.left = left;
			this.value = value;
			this.right = right;
		}
	}
}
