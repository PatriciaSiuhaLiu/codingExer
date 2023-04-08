package tree;

// Level Order Traversal
public class BreadthTraversal {

	public static void main(String[] args) {
		Node rootNode = new Test(10).constructTree();
		printLevelOrderNodes(rootNode);
	}

//	Not efficient TC O(h * n)
	private static void printLevelOrderNodes(Node rootNode) {
//		 To achieve the level order traversal, we can follow two steps
//		1. find the height of the tree
//		2. print all elements for k distance and increase k from 0 to height of the tree
		
		HeightTree treeHeightObj = new HeightTree();
		PrintAtDistance printObj = new PrintAtDistance();
		
		int height = treeHeightObj.getHeightOfTreePublic(rootNode);
		int k = 0;
		while(k <= height) {
			printObj.printAtDistanceKPublic(rootNode, k);
			k++;
		}
		
	}
	
	private static void printLevelOrderNodesByQueue(Node rootNode) {
		
	}

}
