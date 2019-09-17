/**
 * 
 */
package lesson8;

/**
 * @author 610488
 *
 */
public class MyStringLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	Node header;

	public MyStringLinkedList() {
		header = null;
	}

	/**
	 * Add a new Node infront of a Linked List
	 */
	public void addFront(String item) {
		if (header == null)
			header = new Node(null, item, null);
		else {
			Node n = new Node(null, item, header);
			header.prev = n;
			header = n;
		}
	}

	/**
	 * Add a new Node as the last node
	 * 
	 * @param item
	 */
	public void addLast(String item) {
		if (header == null)
			header = new Node(null, item, null);
		else {
			Node temp = header;
			while (temp.next != null)
				temp = temp.next;
			Node n = new Node(temp, item, null);
			temp.next = n;
		}
	}

	/**
	 * 
	 * @param n
	 * @param value
	 */
	public void postAddNode(Node n, String value) {
		Node newNode;
		if (n == null) {
			newNode = new Node(null, value, null);
		} else if (n.next == null) {
			addLast(value);
		} else {
			newNode = new Node(n.next, value, n);
			n.next.prev = newNode;
			n.next = newNode;
		}
	}

	public Node findLast() {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp.next != null)
				temp = temp.next;
			return temp;
		}
	}

	public Node findItem(String value) {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp.next != null)
				if (temp.value.equals(value))
					return temp;
				else
					temp = temp.next;
			return null;
		}
	}

	public class Node {
		private Node prev;
		private String value;
		private Node next;

		public Node(Node prev, String value, Node next) {
			this.prev = prev;
			this.value = value;
			this.next = next;
		}

		@Override
		public String toString() {
			return value;
		}
	}

}
