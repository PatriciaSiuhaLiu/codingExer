package arrays;

public class IsArraySorted {

	public static void main(String[] args) {
		int arr[] = {5,8,10,12, 20, 11};
		
		boolean res = isArraySortedIncreasing(arr);
		System.out.println(res);
		

	}

	private static boolean isArraySortedIncreasing(int[] arr) {
		
		for(int i = 1; i< arr.length; i++) {
			if(arr[i-1] > arr[i]) {
				return false;
			}
		}
		
		return true;
	}

}
