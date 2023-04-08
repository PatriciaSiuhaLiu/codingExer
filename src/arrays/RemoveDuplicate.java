package arrays;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int arr[] = {10, 20, 20, 20, 30, 30, 30, 40};
		
//		int[] res = removeDuplicateFromSorted(arr);
//		System.out.println(Arrays.toString(res));
		
		
		int k = rmDupForEach(arr);
	}
	
	
	// O(n) time and O(n) space
	private static int[] removeDuplicateFromSorted(int[] arr) {
		int res[] = new int[arr.length] ;
		res[0] = arr[0];
		int index = 0;
		for(int i = 1; i < arr.length ; i++) {
			
			if(arr[i-1] != arr[i]) {
				index++;
				res[index] = arr[i];
			}
		}
		for(int i = 0; i< res.length; i++) {
			arr[i] = res[i];
		}
		return arr;
	}
	
	
	private static int rmDupForEach(int[] nums) {
		 int i = nums.length > 0 ? 1 : 0;
		    for (int n : nums)
		        if (n > nums[i-1])
		            nums[i++] = n;
		    return i;
	}
	
	
	 

}
