/**
 * 
 */
package Assignment9;

/**
 * @author 610488
 *
 */

interface Stack {
	public void Push(Node node);
	public Object peek();
	public Object pop();
	public Boolean isEmpty();
	public int size();
}

class Problem2 implements Stack{
	
	private Node[] nodeArr;
	private int top;
	
	/**
	 * @param args
	 */
	static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public Problem2(int n) {
		nodeArr = new Node[n];
		top = -1;
	}

	@Override
	public void Push(Node node) {
		if (nodeArr.length - 1 == top) {
			System.out.println("Stack is full");
		}
		nodeArr[top++] = node;

	}

	@Override
	public Object peek() {	
		return nodeArr[top];
	}

	@Override
	public Object pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		Node item = nodeArr[top];
		top--;
		return item;
	}

	@Override
	public Boolean isEmpty() {
		return (top == -1);
	}

	@Override
	public int size() {
		return top+1;
	}

}

class Node {
	private Node next;
	private Node previous;
	private int value;

	public Node(Node next, Node previous, int value) {
		this.next = next;
		this.previous = previous;
		this.value = value;
	}
}
