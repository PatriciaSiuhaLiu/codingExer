package arrays;

public class MaximumDifference {

	public static void main(String[] args) {
		int arr[] = {5,8,2, 10,12, 20, 11};
		
		int res = maxDifference(arr);
		System.out.println(res);

	}

	private static int maxDifference(int[] arr) {
		
		int minValue = arr[0];
		int maxDiff = arr[1] - arr[0];
		
		for(int i=1; i< arr.length; i++) {
			if(maxDiff < arr[i] - minValue) {
				maxDiff = arr[i] - minValue;
			}
			
			// update minValue if there is an element which is lesser than minValue
			if(minValue > arr[i]) {
				minValue = arr[i];
			}
		}
		return maxDiff;
	}

}
