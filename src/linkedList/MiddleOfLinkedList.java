package linkedList;

public class MiddleOfLinkedList {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		NodeLinkedList head = SinglyLLProvider.generateSinglyLL(arr);
		printMiddle(head);
		printMiddleSlowFast(head);

	}

	private static void printMiddleSlowFast(NodeLinkedList head) {
		NodeLinkedList slow = head;
		NodeLinkedList fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.data);
	}

	private static void printMiddle(NodeLinkedList head) {
		// get the count/length of LL
		NodeLinkedList curr = head;
		int count = 0;
		while (curr != null) {
			count++;
			curr = curr.next;
		}

		// Loop through LL till count/2
		curr = head;
		for (int i = 0; i < count / 2; i++) {
			curr = curr.next;
		}

		System.out.println(curr.data);

	}

}
