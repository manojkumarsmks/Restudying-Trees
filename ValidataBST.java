// Determine if it is a valid binary search tree
// https://leetcode.com/problems/validate-binary-search-tree/description/
public class ValidataBST extends Tree {

	public static void main(String[] args) {
		ValidataBST validataBST = new ValidataBST();
		validataBST.checkIfItsBST(validataBST.TreeExample());
	}

	public void checkIfItsBST(Node root) {
		System.out.println(Validate(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

	public boolean Validate(Node root, int lowerBound, int UpperBound) {
		
		if (root == null)
			return true;
			
		if ((root.getValue() < lowerBound) || (root.getValue() > UpperBound))
			return false;

		return (Validate(root.getLeft(),lowerBound, root.getValue()) 
				&& Validate(root.getRight(), root.getValue(), UpperBound));

	}

}
