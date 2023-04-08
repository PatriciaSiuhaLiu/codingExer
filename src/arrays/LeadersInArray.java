package arrays;

public class LeadersInArray {

	public static void main(String[] args) {
		int arr[] = {5,8,20,10,12};
		printLeaders(arr);

	}
	
	private static void printLeaders(int[] arr) {
		
		int curr_leader = arr[arr.length - 1];
		System.out.print(curr_leader + " ");
		for(int i = arr.length - 2; i>=0; i--) {
			if(curr_leader < arr[i]) {
				curr_leader = arr[i];
				System.out.print(curr_leader + " ");
			}
		}
	}

}
