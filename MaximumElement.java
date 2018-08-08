// Maximum element in a binary tree
public class MaximumElement extends Tree{

	public static void main(String[] args) {
		MaximumElement maximumElement = new MaximumElement();

		System.out.println(maximumElement.Maximum(maximumElement.TreeExample()));
		
	}
	
	public int Maximum(Node root) {
		
		if(root != null) {
			int left = Maximum(root.left);
			int right = Maximum(root.right);
			
			int temp = left >= right?left:right;
			
			return temp>= root.value?temp:root.value;
			
		}
		return Integer.MIN_VALUE;
	}

}
