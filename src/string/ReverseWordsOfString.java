package string;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseWordsOfString {

	public static void main(String[] args) {
		// I/P str = "welcome to gfg"
//		O/p => "gfg to welcome"
		String str = "Welcome to gfg";
//		String reverseStr = reverseWithStack(str);
//		System.out.println(reverseStr);
		
		
//		String res = reverseWithStackClass(str);
//		System.out.println(res);
		
		
		// reverse by using char array
		char charArray [] = str.toCharArray();
		reverseWord(charArray);
	}
	
	//reverser with stack class
	private static String reverseWithStackClass(String str) {
		
		Stack<String> stack = new Stack<>();
		
		int start = 0;
		for(int end = 0; end<str.length(); end++) {
			if(str.charAt(end) == ' ') {
				stack.push(str.substring(start, end));
				start = end + 1;
			}
			if(end == str.length() - 1) {
				stack.push(str.substring(start, end + 1));
			}
		}
		
		String reverseStr = "";
		while(stack.size() > 0) {
			reverseStr = reverseStr + stack.pop();
			if(stack.size() != 0) {
				reverseStr += " ";
			}
		}
		
		return reverseStr;
		
	}

	private static String reverseWithStack(String str) {
		ArrayList<String> stack = new ArrayList<>();
		String reverseStr = "";
		int start = 0;
		//Prepare Stack of words
		for(int end = 0; end< str.length(); end++) {
//			System.out.println(str.charAt(start));
			if(str.charAt(end) == ' ') {
				stack.add(str.substring(start, end));
				start = end + 1;
			}
			if(end == str.length() - 1) {
				stack.add(str.substring(start, end + 1));
			}
		}
		
		for(int i=stack.size() -1 ;  i>= 0; i--) {
			reverseStr += stack.get(i);
			if(i != 0) {
				reverseStr += " ";
			}
			
		}
		return reverseStr;
	}

	
	
	private static void reverseWord(char str[]) {
		//1. reverse each word  (emoclew ot gfg)
		//2. reverse complete string(gfg to welcome)
		int start = 0; 
		for(int end = 0; end < str.length; end++) {
			if(str[end] == ' ') {
				reverse(str, start, end - 1);
				start = end + 1;
			}
		}
		
		reverse(str, start, str.length - 1);
		reverse(str, 0, str.length - 1);
		for(int i = 0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		
	}
	
	private static void reverse(char str[], int start, int end) {
		
		while(start < end) {
			char temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			start++;
			end--;
		}
		
		
	}
}
