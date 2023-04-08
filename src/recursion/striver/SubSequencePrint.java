package recursion.striver;

import java.util.ArrayList;
import java.util.List;

public class SubSequencePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		List<Integer> list = new ArrayList<>();
		printSubSequence(arr, 0, list);

	}
	
	
	static void printSubSequence (int[] arr, int index, List<Integer> list) {
		if(index >= arr.length) {
			// Print sub sequence List
			printList(list);
			return;
		}
		
		list.add(arr[index]);
		printSubSequence(arr, index + 1, list);
		list.remove(list.size() -1);
		printSubSequence(arr, index + 1, list);
		
	}
	
	static void printList(List<Integer> list) {
		list.stream().forEach(System.out::print);
		System.out.println();
	}

}
