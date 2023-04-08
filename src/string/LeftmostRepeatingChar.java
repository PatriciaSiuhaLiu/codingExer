package string;

public class LeftmostRepeatingChar {

	public static void main(String[] args) {
		String str = "abbcc";
		int result = leftmostRepeatingChar1(str);
		System.out.println(result);
	}
	
	
	// O(n) but two iteration
	private static int leftmostRepeatingChar(String str) {
		int count[] = new int[256];
		for(int i=0; i< str.length(); i++) {
			count[str.charAt(i)]++;
		}
		
		for(int i=0; i< str.length(); i++) {
			if(count[str.charAt(i)] > 1) {
				return i;
			}
		}
		return -1;
	}
	
	// O(n) in single iteration
		private static int leftmostRepeatingChar1(String str) {
			int count[] = new int[256];
			for(int i=0; i< str.length(); i++) {
				count[str.charAt(i)]++;
			}
			
			for(int i=0; i< str.length(); i++) {
				if(count[str.charAt(i)] > 1) {
					return i;
				}
			}
			return -1;
		}

}
