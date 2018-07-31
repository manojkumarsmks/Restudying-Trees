// Determine if it is a valid binary search tree
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
		//System.out.println("Root value is " +root.value + " lowerbound is "+lowerBound +" upperbound is "+UpperBound);
		
		if ((root.getValue() < lowerBound) || (root.getValue() > UpperBound))
			return false;


		return (Validate(root.getLeft(),lowerBound, root.getValue()) 
				&& Validate(root.getRight(), root.getValue(), UpperBound));

	}

}
