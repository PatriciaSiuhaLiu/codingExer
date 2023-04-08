package string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String str1 = "abaac";
		String str2 = "baaca";
		
//		boolean result = isAnagramBySort(str1, str2);
//		
//		System.out.println(result);
		
		
		boolean result1 = isAnagramByCharComapre(str1, str2);
		System.out.println(result1);
	}
	
	
	// time O(nlogn)
	private static boolean isAnagramBySort(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		char arr[] = str1.toCharArray();
		Arrays.sort(arr);
		str1 = new String(arr);
		
		
		char arr2[] = str2.toCharArray();
		Arrays.sort(arr2);
		str2 = new String(arr2);
		
		return str1.equals(str2);
	}
	
	
	private static boolean isAnagramByCharComapre(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		
		int count[] = new int[256];
		 
		
		
		for(int i = 0; i<str1.length(); i++) {
			count[str1.charAt(i)]++;
			count[str2.charAt(i)]--;
		}
		
		for(int i = 0; i< str1.length() ; i++) {
			if(count[str1.charAt(i)] != 0) {
				return false;
			}
		}
		
		return true;
		
	}
	
	

}
