// https://leetcode.com/problems/symmetric-tree/description/
import java.util.ArrayList;
import java.util.List;

public class SymmeticTrees extends Tree {

	public static void main(String[] args) {
		SymmeticTrees symmetricTree = new SymmeticTrees();
		System.out.println(symmetricTree.isSymmetric(symmetricTree.Example2()));
	}

	public boolean isSymmetric(Node root) {
		if(root == null)
			return true;
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();

		left = symmetricLeft(root.left, left);
		right = symmetricRight(root.right, right);

		/*for (int i = 0; i < left.size(); i++) {
			System.out.println(left.get(i));
		}

		System.out.println("-----------------------");

		for (int i = 0; i < right.size(); i++) {
			System.out.println(right.get(i));
		}*/

		return left.equals(right);
	}

	public List<Integer> symmetricLeft(Node root, List<Integer> list) {

		if (root == null) {
			list.add(null);
			return list;
		}

		list.add(root.value);
		symmetricLeft(root.left, list);
		symmetricLeft(root.right, list);

		return list;

	}

	public List<Integer> symmetricRight(Node root, List<Integer> list) {

		if (root == null) {
			list.add(null);
			return list;
		}

		list.add(root.value);

		symmetricRight(root.right, list);
		symmetricRight(root.left, list);

		return list;

	}

}
