package arrays;

public class LargestElementArray {

	public static void main(String[] args) {
		int arr[] = {5,8,20,10,12};
		
		int index = largestElement(arr);
		System.out.println(index);
		
		int secondLargestIndex = secondLargestElement(arr);
		System.out.println(secondLargestIndex);
		
		int arr1[] = {10,10,10};
		int secondLargestIndex1 = secondLargestElement(arr1);
		System.out.println(secondLargestIndex1);
	}

	private static int largestElement(int[] arr) {
		int largest = 0;
		int largestIndex = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(largest < arr[i]) {
				largest = arr[i];
				largestIndex =  i;
			}
		}
		return largestIndex;
	}
	
	private static int secondLargestElement(int[] arr) {
//		int largest = 0;
//		int secondLargest = 0;
		int largestIndex = 0;
		int secondLargestIndex = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[largestIndex] < arr[i]) {
				secondLargestIndex = largestIndex;
				largestIndex = i;
			}else if(arr[largestIndex] != arr[i]) {
				if(secondLargestIndex == -1 || arr[secondLargestIndex] < arr[i]) {
					secondLargestIndex = i;
				}
			}
			
			
		}
		return secondLargestIndex;
	}

}
