package tree;

public class HeightTree {

	public static void main(String[] args) {
		Node rootNode = new Test(10).constructTree();		
		int height = getHeightOfTree(rootNode);	
		System.out.println(height);
	}

	private static int getHeightOfTree(Node rootNode) {
		if(rootNode == null) {
			return 0;
		}else {
			int leftTreeHeight = getHeightOfTree(rootNode.left);
			int rightTreeHeight = getHeightOfTree(rootNode.right);
			int height = Math.max(leftTreeHeight, rightTreeHeight) + 1;
			return height;
		}	
	}
	public int getHeightOfTreePublic(Node rootNode) {
		if(rootNode == null) {
			return 0;
		}else {
			int leftTreeHeight = getHeightOfTree(rootNode.left);
			int rightTreeHeight = getHeightOfTree(rootNode.right);
			int height = Math.max(leftTreeHeight, rightTreeHeight) + 1;
			return height;
		}	
	}

}
