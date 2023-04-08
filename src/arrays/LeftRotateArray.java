package arrays;

import java.util.Arrays;

public class LeftRotateArray {

	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50, 60, 70, 80};
		
//		int[] res = leftRotateArrayByOne(arr);
//		System.out.println(Arrays.toString(res));
		
		int[] resD = leftRotateByD(arr, 2);
		System.out.println(Arrays.toString(resD));

	}

	private static int[] leftRotateArrayByOne(int[] arr) {
		int temp = arr[0];
		for(int i=1; i<arr.length; i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length - 1] = temp;
		return arr;
	}
	
	//O(n) time O(n) space
	private static int[] leftRotateByD(int[] arr, int d) {
		
		//hold element from 0 to d in a temp array
		// move remaining elements of the array d position back
		// insert temp array element at the end of the main array in the same order
		int temp[] = new int[d];
		for(int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}
		
		
		for(int i = d; i < arr.length; i++) {
			arr[i - d] = arr[i];
		}
		
		for(int i=0; i<d; i++) {
			arr[arr.length-d + i] = temp[i];
		}
		return arr;
	}

	
	//O(n) time O(1) space
		private static int[] leftRotateByDOptimized(int[] arr, int d) {
			
			//hold element from 0 to d in a temp array
			// move remaining elements of the array d position back
			// insert temp array element at the end of the main array in the same order
			int temp[] = new int[d];
			for(int i = 0; i < d; i++) {
				temp[i] = arr[i];
			}
			
			
			for(int i = d; i < arr.length; i++) {
				arr[i - d] = arr[i];
			}
			
			for(int i=0; i<d; i++) {
				arr[arr.length-d + i] = temp[i];
			}
			return arr;
		}
}
