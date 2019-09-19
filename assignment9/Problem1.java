package Assignment9;

public class Problem1 {
	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;
	
	

	public int peek() {
		if(front == -1) return -1;
		return arr[front];
	}

	public void enqueue(int obj) {
		if(arr.length == rear) resize();
		arr[rear++] = obj;
	}

	public int dequeue() {
		if(rear == 0) return 0;
		int tempFront = arr[front];
		int[] newArr = new int[arr.length - 1];
		System.arraycopy(arr, 1, newArr, 0, newArr.length);
		arr = newArr;
		front = newArr[0];
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
		if(arr.length == rear) {
			int[] newArr = new int[arr.length * 2];
			System.arraycopy(arr, 0, newArr, 0, arr.length);
			arr = newArr;
		}
	}
}
