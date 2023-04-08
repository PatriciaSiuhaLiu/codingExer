package recursion.striver;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceSum1 {
	
	static int target=2;
	public static void main(String[] args) {
		int[] arr = {1, 2, 1};
		
		int sum=0;
		List<Integer> list = new ArrayList<>();
		subSequenceSum(arr, 0, sum, list );

	}

	// Print all the subsequence whose sum is equal to the target
	private static void subSequenceSum(int[] arr, int index, int sum, List<Integer> list) {
		if(index >= arr.length) {
			if(sum == target) {
				printList(list);
			}
			return;
		}
		
		list.add(arr[index]);
		sum += arr[index];
		subSequenceSum(arr, index + 1, sum, list);
		
		list.remove(list.size() -1);
		sum -= arr[index];
		subSequenceSum(arr, index + 1, sum, list);
		
	}

	private static void printList(List<Integer> list) {
		list.stream().forEach(System.out::print);
		System.out.println();
		
	}

	
}
