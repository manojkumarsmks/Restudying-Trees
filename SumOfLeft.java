// Sum of the left nodes
// https://leetcode.com/problems/sum-of-left-leaves/description/
public class SumOfLeft extends Tree{

	public static void main(String[] args) {
		SumOfLeft sumOfLeft = new SumOfLeft();
		System.out.println(sumOfLeft.sumOfLeft(sumOfLeft.Example1()));
	}
	
	public int sumOfLeft(Node root) {
		
		if(root == null)
			return 0;
		int leftSum = sumOfLeft(root.left);
		int rightSum = sumOfLeft(root.right);
		
		if(root.left != null && root.left.left == null && root.left.right == null) {
			System.out.println(root.left.value);
			return root.left.value + leftSum + rightSum;
		}
		
		return leftSum+rightSum;
	}

}
