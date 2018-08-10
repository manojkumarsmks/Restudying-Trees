// https://leetcode.com/problems/binary-tree-paths/description/
import java.util.ArrayList;
import java.util.List;
public class BinaryTreePath extends Tree{

	public static void main(String[] args) {
		BinaryTreePath binaryTreePath = new BinaryTreePath();
		List<Integer> list = new ArrayList<>();
		List<String> result = new ArrayList<>();
		binaryTreePath.binaryPath(binaryTreePath.Example1(), list, result);
	}
	
	public List<String> binaryPath(Node root, List<Integer> list, List<String> result) {
		if(root == null)
			return result;
		list.add(root.value);
		if(root.left == null && root.right == null ) {
			String s = new String();
			for (int i = 0; i < list.size(); i++) {
				s = s+list.get(i)+"->";
			}
			result.add(s.substring(0, s.length()-2));
		}
		binaryPath(root.left, list, result);
		binaryPath(root.right, list, result);
		list.remove(list.size()-1);
		
		return result;
	}

}
