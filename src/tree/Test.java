package tree;

public class Test {
	Node root;
	
	public Test(int key) {
		root = new Node(key);
	}
	public static void main(String[] args) {
//		Node root = new Node(10);
		
		
	}
	
	public Node constructTree() { 
		root.left = new Node(20);
		root.right = new Node(30);
		
		root.left.left = new Node(8);
		root.left.right = new Node(7);
		root.right.right = new Node(6);
		
		root.left.right.left = new Node(9);
		root.left.right.right = new Node(15);
		
		return root;
	}
}
