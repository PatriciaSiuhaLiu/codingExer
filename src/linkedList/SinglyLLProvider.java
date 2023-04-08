package linkedList;

public class SinglyLLProvider {
	
	public static NodeLinkedList generateSinglyLL(int[] arr) {
//		int[] arr1 = {1,2,3,4,5};
		NodeLinkedList temp = new NodeLinkedList(0);
		NodeLinkedList head;
		NodeLinkedList curr = new NodeLinkedList(arr[0]);
		
		temp.next = curr;
		for(int i = 1; i< arr.length; i++) {
			curr.next = new NodeLinkedList(arr[i]);
			curr = curr.next;
		}
		return temp.next;
	}

}
