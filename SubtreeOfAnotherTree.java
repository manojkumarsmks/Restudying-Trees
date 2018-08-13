// https://leetcode.com/problems/subtree-of-another-tree/description/
public class SubtreeOfAnotherTree extends Tree{

	public static void main(String[] args) {
		SubtreeOfAnotherTree subtreeOfAnotherTree = new SubtreeOfAnotherTree();
		System.out.println(subtreeOfAnotherTree.isSubTree(subtreeOfAnotherTree.Example1(), subtreeOfAnotherTree.Example2()));
	}
	
	public boolean isSubTree(Node s, Node t) {
		if(s == null && t == null)
			return true;
		if((s == null && t != null) || (s != null && t == null))
			return false;
		if(identical(s, t))
			return true;
		else 
			return isSubTree(s.left, t) || isSubTree(s.right, t);
			

	}
	
	public boolean identical(Node s, Node t) {
		
		if(s == null && t == null)
			return true;
		
		if((s != null && t == null) || (s == null && t != null) || (s.value != t.value))
			return false;
		
		return ((s.value == t.value) && identical(s.left, t.left) && identical(s.right, t.right));
		
	}

}
