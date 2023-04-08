package linkedList;

import java.util.ArrayList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		NodeLinkedList head = SinglyLLProvider.generateSinglyLL(arr);
		
		// Reverse a list with brute force
		
//		NodeLinkedList revLLHead = reverseLL(head);
		
		NodeLinkedList revLLHead1 = reverseLLEffective(head);
		
		TraverseSinglyLL.printLinkedList(revLLHead1);

	}

	private static NodeLinkedList reverseLLEffective(NodeLinkedList head) {
		NodeLinkedList curr = head;
		NodeLinkedList prev = null;
		
		while(curr != null) {
			NodeLinkedList next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	private static NodeLinkedList reverseLL(NodeLinkedList head) {
		//1. Store all the nodes data into an ArrayList
		//2. traverse through LL and take out elements from end and put it in the LL node
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(NodeLinkedList curr = head; curr != null; curr = curr.next) {
			arr.add(curr.data);
		}
		
		for(NodeLinkedList curr = head; curr != null; curr = curr.next) {
			curr.data = arr.remove(arr.size() - 1);
		}
		return head;
	}

}

