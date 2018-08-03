// Invert Binary Tree
// https://leetcode.com/problems/invert-binary-tree/description/
public class InvertBinaryTree extends Tree{

	public static void main(String[] args) {
		InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
		invertBinaryTree.preOrderRecursive(invertBinaryTree.invertTree(invertBinaryTree.Example1()));
	}
	
	public Node invertTree(Node root) {
		if(root == null)
			return null;
		
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;
		
		invertTree(root.left);
		invertTree(root.right);
		
		return root;
					
	}

}
