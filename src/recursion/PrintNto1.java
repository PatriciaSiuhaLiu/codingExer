package recursion;

public class PrintNto1 {

	public static void main(String[] args) {
		printNToOne(8);
 
	}
	
	static void printNToOne(int n) {
		if(n < 1) {
			return;
		}
		System.out.println(n);
		printNToOne(n - 1);
	}

}
