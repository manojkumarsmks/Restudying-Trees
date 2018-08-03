// https://leetcode.com/problems/search-in-a-binary-search-tree/description/
// Search and return the sub tree
public class SearchBST extends Tree{

	public static void main(String[] args) {
		
		SearchBST searchBST = new SearchBST();
		Node temp = searchBST.search(searchBST.TreeExample(), 12);
		
		searchBST.LevelOrderTraversal(temp);
		
	}
	
	public Node search(Node root, int val) {
		
		if(root == null)
			return null;
		
		if(root.value == val)
			return root;
		
		Node left = search(root.left, val);
		Node right = search(root.right, val);
		
		if(left == null && right == null)
			return null;
		
		return left==null?right:left;

	}

}
