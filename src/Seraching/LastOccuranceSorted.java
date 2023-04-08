package Seraching;

public class LastOccuranceSorted {

	public static void main(String[] args) {
		int[] arr = {10,10,20,20,20,20,20, 30, 40};
		
		int result = searchLastOccurance(arr, 20);
		System.out.println(result);
	}

	private static int searchLastOccurance(int[] arr, int x) {
		int low = 0; int high = arr.length - 1;
		
		while(low <= high) {
			int mid = (low + high)/2;
			
			if(x > arr[mid]) {
				low = mid + 1;
			}else if( x < arr[mid]) {
				high = mid -1;
			}else {
				if(mid == arr.length || arr[mid+1] != arr[mid]) {
					return mid;
				}else {
					low = mid +1;
				}
			}
			
		}
		return  -1;
	}

}
