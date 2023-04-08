package string;

public class Subsequence {

	public static void main(String[] args) {
		
		String str = "ABC";
		String subStr="BC";
		boolean result = isSubsequence(subStr , str );
		System.out.println(result);

	}

	
	private static boolean isSubsequence(String s, String t) {
//        return isSubRecursive(s, t, s.length(), t.length());
        return isSubIterative(s, t, s.length(), t.length());
    }
	
	private static boolean isSubIterative(String sub, String total, int subLength, int totalLength){
        
        int i = 0; int j=0;
        
        for( i = 0, j = 0; i< totalLength && j < subLength; i++) {
        	if(total.charAt(i) == sub.charAt(j)) {
        		j++;
        	}
        }
        
        return(j == subLength);
        
    }
    
    private static boolean isSubRecursive(String sub, String total, int subLength, int totalLength){
        
        if(subLength == 0){
            return true;
        }
        if(totalLength == 0){
            return false;
        }
        if(sub.charAt(subLength - 1) == total.charAt(totalLength -1)){
            return isSubRecursive(sub, total, subLength - 1, totalLength - 1);
        }else {
           return isSubRecursive(sub, total, subLength, totalLength - 1);
        }
        
        
    }

}
