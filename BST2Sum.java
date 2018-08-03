
// https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/
import java.util.HashSet;
import java.util.Set;

public class BST2Sum extends Tree {

	public static void main(String[] args) {
		BST2Sum bst2Sum = new BST2Sum();
		bst2Sum.checkForSum(bst2Sum.TreeExample());
	}

	public void checkForSum(Node root) {
		Set<Integer> set = new HashSet<>();
		int target = 37;

		System.out.println(checkForSum(root, target, set));
	}

	public boolean checkForSum(Node root, int target, Set<Integer> set) {

		if (root == null)
			return false;

		if (set.contains(target - root.value))
			return true;
		set.add(root.value);

		return checkForSum(root.left, target, set) || checkForSum(root.right, target, set);
	}

}
