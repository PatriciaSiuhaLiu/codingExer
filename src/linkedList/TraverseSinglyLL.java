package linkedList;

public class TraverseSinglyLL {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		NodeLinkedList head = SinglyLLProvider.generateSinglyLL(arr);

		printLinkedList(head);

	}

	public static void printLinkedList(NodeLinkedList head) {
		// print Linked List
		NodeLinkedList curr = head;
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}

	}

}
