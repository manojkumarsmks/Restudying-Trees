// https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
public class MinDepthOfBST extends Tree{

	public static void main(String[] args) {
		MinDepthOfBST minDepthOfBST = new MinDepthOfBST();
		System.out.println(minDepthOfBST.minDepth(minDepthOfBST.Example1()));
	}

	public int minDepth(Node root) {
		if(root == null)
			return 0;
		
		if(root.left == null && root.right == null)
			return 1;
		
		int left = minDepth(root.left)+1;
		int right = minDepth(root.right)+1;
		
		return left > right ? right : left;
	}
}
