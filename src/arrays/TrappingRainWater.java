package arrays;

public class TrappingRainWater {

	public static void main(String[] args) {
		int arr[] = {3,0,1,2,5};
		int res = trapRainWater(arr);
		System.out.println(res);
	

	}

	private static int trapRainWater(int[] arr) {
		
		int res = 0;
		for(int i = 1; i< arr.length - 1; i++) {
			
			int lMax = arr[i];
			for(int j = i-1; j>= 0; j--) {
				lMax = Math.max(lMax, arr[j]);
			}
			
			int rMax = arr[i];
			for(int k = i+1; k< arr.length; k++) {
				rMax = Math.max(rMax, arr[k]);
			}
			
			res = res + Math.min(lMax, rMax) - arr[i];
		}
		
		return res;
		
	}

}
