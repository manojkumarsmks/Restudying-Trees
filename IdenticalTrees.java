// check if two trees are identical
// https://leetcode.com/problems/same-tree/description/
public class IdenticalTrees extends Tree{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IdenticalTrees identicalTrees = new IdenticalTrees();
		System.out.println(identicalTrees.IdenticalOrNot(identicalTrees.Example1(), identicalTrees.Example2()));
	}
	
	public boolean IdenticalOrNot(Node root1, Node root2) {
		
		if((root1 == null && root2 == null) || (root1.value == root2.value))
			return true;
		if((root1 == null && root2 != null) || (root1 != null && root2 == null) || (root1.value != root2.value))
			return false;
		return IdenticalOrNot(root1.left, root2.left) && IdenticalOrNot(root1.right, root2.right);
	
	}		

}
