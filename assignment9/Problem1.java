package Assignment9;

public class Problem1 {
	public static void main(String[] args) {
		QueueList arq = new QueueList();
		// enqueue 20
		for (int i = 0; i < 20; i++) {
			arq.enqueue(i);
		}
		System.out.println("Size: " + arq.size());
		System.out.println("Peek: " + arq.peek());
		System.out.println("Size: " + arq.size());
		System.out.println("Dequeue: " + arq.dequeue());
		System.out.println("Size: " + arq.size());
		System.out.println("Peek: " + arq.peek());
		// arq.enqueue(100);

		// remove 20 items from the queue
		int n = arq.size();
		for (int i = 0; i < n; i++)
			System.out.println(i + "=>Dequeue: " + arq.dequeue());
		System.out.println("Peek: " + arq.peek());
		System.out.println("Size: " + arq.size());
		System.out.println("Dequeue: " + arq.dequeue());
	}
}

class QueueList {
	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;

	public int peek() {
		if (isEmpty())
			return -1;
		if (front == -1)
			return -1;
		return arr[front];
	}

	public void enqueue(int obj) {
		if (arr.length == rear)
			resize();
		arr[rear++] = obj;
		if (front == -1) {
			front++;
		}
	}

	public int dequeue() {
		if (rear == 0)
			return 0;
		int tempFront = arr[front];
		int[] newArr = new int[arr.length - 1];
		System.arraycopy(arr, 1, newArr, 0, newArr.length);
		arr = newArr;
		rear--;
		return tempFront;
	}

	public boolean isEmpty() {
		return (rear == 0);
	}

	public int size() {
		return rear;
	}

	private void resize() {
		if (arr.length == rear) {
			int[] newArr = new int[arr.length * 2];
			System.arraycopy(arr, 0, newArr, 0, arr.length);
			arr = newArr;
		}
	}
}
