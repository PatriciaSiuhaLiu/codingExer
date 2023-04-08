package string;

public class Palindrome {

	public static void main(String[] args) {
		 
		String str = "ABCCBA";
//		boolean result = palindromeRevrse(str);
		boolean result = palindrome(str);
		System.out.println(result);
		
		String strSpace = "A man, a plan, a canal:panama";
		boolean resultSpace = palindromeWithSpaces(strSpace);
		System.out.println(resultSpace);

	}
	// O(n) Time and O(n) space
	static boolean  palindromeRevrse(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return str.equals(sb.toString());
	}
	
	// O(n) Time and O(1) space
	static boolean  palindrome(String str) {
		int head = 0; int tail = str.length() - 1;
		while(head < tail) {
			if(str.charAt(head) == str.charAt(tail)) {
				head++;
				tail--;
			}else {
				return false;
			}
		}
		return true;
	}
	
	//
	static boolean palindromeWithSpaces(String str) {
		int head = 0; int tail = str.length() - 1;
		
		while(head < tail) {
			
			if(!Character.isLetterOrDigit(str.charAt(head))) {
				head++;
			}else if(!Character.isLetterOrDigit(str.charAt(tail))) {
				tail--;
			}else {
				if(Character.toLowerCase(str.charAt(head)) == Character.toLowerCase(str.charAt(tail))) {
					head++;
					tail--;
				}else {
					return false;
				}
			}
		}
		
		return true;
	}
	
	
	
	

}
