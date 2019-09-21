/**
 * 
 */
package Assignment9;

/**
 * @author 610488
 *
 */
public class Problem2{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayStack stk = new ArrayStack(); // create stack of size 4
		Object item;
		stk.push('A'); // push 3 items onto stack
		stk.push('B');
		stk.push('C');
		stk.push('D');
		
		System.out.println("size(): "+ stk.size());
		item = stk.pop(); // delete item
		System.out.println(item + " is deleted");
		stk.push('D'); // add three more items to the stack
		stk.push('E');
		System.out.println(stk.pop() + " is deleted");
		stk.push('G'); // push one item
		item = stk.peek(); // get top item from the stack
		System.out.println(item + " is on top of stack");
		System.out.println("Size of the Stack : " + stk.size());
	}
}

interface Stack {
	public void push(Object obj);
	public Object peek();
	public Object pop();
	public Boolean isEmpty();
	public int size();
}

class ArrayStack implements Stack{
	

	Node top = null;
	

	@Override
	public void push(Object obj) {
		if(isEmpty()) {
			Node n = new Node(null,obj,null);
			top = n;
		}
		else {
			Node n = new Node(top,obj,null);
			top.next = n;
			top = n;
		}
		
	}

	@Override
	public Object pop() {
		Node n = top;
		top = n.previous;
		return n.value;
	}

	@Override
	public Object peek() {
		if(isEmpty()) return null;
		return top.value;
	}

	@Override
	public Boolean isEmpty() {
		if(top == null) return true;
		return false;
	}

	@Override
	public int size() {
		int count = 0;
		Node n = top;
		while(n != null) {
			n = n.previous;
			count++;
		}
		return count;
	}


}

class Node {
	Node next;
	Node previous;
	Object value;

	public Node(Node next, Object value, Node previous) {
		this.next = next;
		this.previous = previous;
		this.value = value;
	}

	
}
