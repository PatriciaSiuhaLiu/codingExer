package arrays;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
//		int arr[] = {5,8,10,12, 20, 11};
		int arr[] = {10, 20, 30};
		
		int[] res = isArraySortedIncreasing(arr);
		
		System.out.println(Arrays.toString(res));

	}

	private static int[] isArraySortedIncreasing(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		
		while(low < high) {
			
			int temp = arr[high];
			arr[high] = arr[low];
			arr[low] = temp;
			high--;
			low++;
		}
		return arr;
	}

}
