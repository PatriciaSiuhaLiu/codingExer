package Seraching;

public class BSRecursive {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 40, 55, 76, 80, 90};
		int low = 0;
		int high = arr.length -1;
		int result = search(arr, 40, low, high);
		System.out.println(result);

	}

	private static int search(int[] arr, int x, int low, int high) {
		
			int mid = (low + high )/ 2;
			
			if(low > high) {
				return - 1;
			}
			
			if(arr[mid] == x) {
				return mid;
			}else if(arr[mid] < x) {
				low = mid + 1;
				return search(arr, x, low, high);
			}else {
				high = mid -1;
				return search(arr, x, low, high);
			}
	}	

}
