package recursion.striver;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceSum2 {
	static int target=2;
	public static void main(String[] args) {
	int[] arr = {1, 2, 1};
		
		int sum=0;
		List<Integer> list = new ArrayList<>();
		subSequenceSum(arr, 0, sum, list );


	}

	private static boolean subSequenceSum(int[] arr, int index, int sum, List<Integer> list) {
		if(index >= arr.length) {
			if(sum == target) {
				printList(list);
				return true;
			}
			return false;
		}
		
		list.add(arr[index]);
		sum += arr[index];
		if( subSequenceSum(arr, index + 1, sum, list) == true) {
			return true;
		}
		
		list.remove(list.size() -1);
		sum -= arr[index];
		if( subSequenceSum(arr, index + 1, sum, list) == true) {
			return true;
		}
		return false;
		
	}

	private static void printList(List<Integer> list) {
		list.stream().forEach(System.out::print);
		System.out.println();
		
	}

}
