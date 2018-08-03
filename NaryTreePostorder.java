// https://leetcode.com/problems/n-ary-tree-postorder-traversal/description/
import java.util.ArrayList;
import java.util.List;

public class NaryTreePostorder {
	
	List<Integer> result  = new ArrayList<Integer>();
	public static void main(String[] args) {
		
		
	}
	
	 public List<Integer> postorder(TreeNode root) {
		 
		 if(root == null)
			 return result;
		 
		 result.add(root.val);
		 for(int i = 0; i <root.children.size();i++) {
			 postorder(root.children.get(i));
		 }
		 
		 return result;
	 }

}

class TreeNode {
	public int val;
	public List<TreeNode> children;
	
	public TreeNode() {};
	
	public TreeNode(int val, List<TreeNode> children) {
		this.val = val;
		this.children = children;
	}
	
}
