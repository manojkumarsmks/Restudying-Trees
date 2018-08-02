// https://leetcode.com/problems/merge-two-binary-trees/description/
public class MergeTrees extends Tree{

	public static void main(String[] args) {
		MergeTrees mergeTrees = new MergeTrees();
		mergeTrees.Merge(mergeTrees.Example1(), mergeTrees.Example2());
		
	}
	
	public void Merge(Node n1, Node n2) {
		System.out.println("N1 "+n1.value + " N2 "+n2.value);
		if(n1 == null && n2 == null)
			return;
		
		if(n1 != null && n2 != null) {
			n1.value += n2.value;
		}
		
		if(n1.left == null && n2.left != null) {
			n1.left = new Node(n2.left.value);
		}
		Merge(n1.left, n2.left);
		Merge(n1.right, n2.right);
		
	}

}
