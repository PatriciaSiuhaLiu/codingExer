package queue;

public class Queue {
	int size, cap;
	int arr[];
	
	Queue(int c) {
		cap = c;
		size = 0;
		arr = new int[cap];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	void enqueue (int x) {
		arr[size] = x;
		size++;
	}
	
	void dequeue() {
		for(int i =0; i< arr.length; i++) {
			arr[i] = arr[i+1];
			
		}
	}
	
	boolean isFull() {
		return (size == cap);
	}
	
	boolean isEmpty() {
		return (size == 0);
	}
	
	int getFront() {
		return arr[0];
	}
	
	int getRear() {
		return arr[size - 1];
	}

}
