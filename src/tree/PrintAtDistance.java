package tree;

public class PrintAtDistance {

	public static void main(String[] args) {
		Node rootNode = new Test(10).constructTree();
		
		printAtDistanceK(rootNode, 1);

	}

	private static void printAtDistanceK(Node rootNode, int k) {
		
		if(rootNode == null) {
			return;
		}
		
		if(k == 0) {
			System.out.println(rootNode.key + " ");
		}else {
			printAtDistanceK(rootNode.left, k - 1);
			printAtDistanceK(rootNode.right, k - 1);
		}
	}
	
	
	public void printAtDistanceKPublic(Node rootNode, int k) {
		
		if(rootNode == null) {
			return;
		}
		
		if(k == 0) {
			System.out.println(rootNode.key + " ");
		}else {
			printAtDistanceK(rootNode.left, k - 1);
			printAtDistanceK(rootNode.right, k - 1);
		}
	}

}
