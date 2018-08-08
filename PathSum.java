// https://leetcode.com/problems/path-sum/description/
public class PathSum extends Tree {

	public static void main(String[] args) {
		PathSum pathSum = new PathSum();
		System.out.println(pathSum.hasPathSum(pathSum.TreeExample(), 65));
	}

	public boolean hasPathSum(Node root, int sum) {

		if (root != null) {
			
			if(root.left == null && root.right == null) {
				
				if(root.value == sum)
					return true;
				else
					return false;
				
			}
			
			return hasPathSum(root.left, sum-root.value) || hasPathSum(root.right, sum-root.value);
			
				
		}
		
		return false;
	}

}
