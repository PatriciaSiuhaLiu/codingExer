package queue;

public class QueueWithCircularArray {
	int cap, size, front;
	int[] arr;
	QueueWithCircularArray(int c){
		cap  = c;
		arr = new int[cap];
		size = 0;
		front = 0;	
	}
	
	
	void enqueue(int x) {

		
	}
	
	void dequeue() {
//		front = (front + 1) % cap;
//		size--;
	}
	
}
