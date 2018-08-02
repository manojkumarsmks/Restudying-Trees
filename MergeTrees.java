// https://leetcode.com/problems/merge-two-binary-trees/description/
public class MergeTrees extends Tree {

	public static void main(String[] args) {
		MergeTrees mergeTrees = new MergeTrees();
		mergeTrees.InOrderRecursive(mergeTrees.Merge(mergeTrees.Example1(), mergeTrees.Example2()));

	}

	public Node Merge(Node n1, Node n2) {

		if (n1 == null && n2 == null)
			return null;

		if (n1 != null && n2 != null) {
			n1.value += n2.value;
		} else {
			return n1 == null ? n2 : n1;

		}

		n1.left = Merge(n1.left, n2.left);
		n1.right = Merge(n1.right, n2.right);
		return n1;
	}

}
