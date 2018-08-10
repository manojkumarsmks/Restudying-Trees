// https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
public class MaxDepthBST extends Tree{

	public static void main(String[] args) {
		MaxDepthBST maxDepthBST = new MaxDepthBST();
		System.out.println(maxDepthBST.maxDepth(maxDepthBST.Example1()));
	}

	public int maxDepth(Node root) {
		if (root == null)
			return 0;

		if (root.left == null && root.right == null)
			return 1;

		int left = maxDepth(root.left) + 1;
		int right = maxDepth(root.right) + 1;

		return Math.max(left, right);
	}

}
