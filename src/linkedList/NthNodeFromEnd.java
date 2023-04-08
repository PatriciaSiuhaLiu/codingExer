package linkedList;

public class NthNodeFromEnd {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		NodeLinkedList head = SinglyLLProvider.generateSinglyLL(arr);
		int n = 2;
//		printNthNodeFromEnd(head, 2);
		printNthNodeFromEnd2Pointer(head, 3);

	}

	private static void printNthNodeFromEnd2Pointer(NodeLinkedList head, int n) {

		NodeLinkedList first = head;
		NodeLinkedList second = head;
		for (int i = 0; i < n; i++) {
			// check for first becomes null before reaching to the nth node
			if(first == null) return;
			first = first.next;
		}
		
		while(first != null) {
			first = first.next;
			second = second.next;
		}
		
		System.out.println(second.data);

	}

	private static void printNthNodeFromEnd(NodeLinkedList head, int n) {
		// get the length of the of LL
		NodeLinkedList curr = head;
		int count = 0;
		while (curr != null) {
			count++;
			curr = curr.next;
		}
		System.out.println(count);
		curr = head;
		for (int i = 1; i < count - n + 1; i++) {
			curr = curr.next;
		}
		System.out.println(curr.data);
	}

}
