package Seraching;

public class FirstOccuranceSorted {

	public static void main(String[] args) {
		int[] arr = {10,10,20,20,20,20,20};
		
		int result = searchFirstOccurance(arr, 20);
		System.out.println(result);
	}

	private static int searchFirstOccurance(int[] arr, int x) {
		int low = 0; int high = arr.length - 1;
		
		while(low <= high) {
			int mid = (low + high)/2;
			
			if(x > arr[mid]) {
				low = mid + 1;
			}else if( x < arr[mid]) {
				high = mid -1;
			}else {
				if(mid == 0 || arr[mid-1] != arr[mid]) {
					return mid;
				}else {
					high = mid -1;
				}
			}
			
		}
		return  -1;
	}

}
