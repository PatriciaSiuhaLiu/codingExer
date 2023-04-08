package arrays;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		int arr[] = {10, 20, 0, 30, 0, 40, 0, 0};
		
		int arr1[] = {10, 8, 0, 0, 12, 0};
		
//		int[] res = moveAllZerosToEnd(arr1);
//		System.out.println(Arrays.toString(res));
		
		int arr2[] = {0, 1, 0, 3, 12};
		moveZerosEndTry(arr2);

	}

	private static int[] moveAllZerosToEnd(int[] arr) {
		
		int prevZeroIndex = -1;
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == 0 && prevZeroIndex == -1) {
				prevZeroIndex = i;
			}else if(prevZeroIndex != -1 && arr[i] != 0) {
				int temp = arr[prevZeroIndex];
				arr[prevZeroIndex] = arr[i];
				arr[i] = temp;
				prevZeroIndex = i;
				
			}
		}
		
		return arr;
	}
	
	
	private static void moveZerosEndTry(int[] nums) {
		int zeroIndex = -1;
        
      for(int i = 0; i< nums.length; i++){
          if(nums[i] != 0){
              if(zeroIndex != -1){
                 int temp = nums[i];
                  nums[i] = nums[zeroIndex];
                  nums[zeroIndex] = temp;
                  zeroIndex++;
              }     
          }else {
        	  if(zeroIndex == -1)
              zeroIndex++;
          }
      }
	}

}
