package Seraching;

public class BSIterative {
	
	
	// Binary search using Iterative method
	public static void main(String[] args) {
		int[] arr = {10, 20, 40, 55, 76, 80, 90};
		
		int result = search(arr, 40);
		System.out.println(result);
	}

	private static int search(int[] arr, int n) {
		int low = 0;
		int high = arr.length -1;
		int mid;
//		for(low = 0; low < high; low ++) { // Do not use for for loop in this case
		while(low <= high) {
			mid = (low + high)/2;
			if(n > arr[mid]) {
				low = mid + 1;
			}else if(n < arr[mid]) {
				high = mid -1;
			}else {
				return mid;
			}
		}
//	}
		return  -1;
}


}
