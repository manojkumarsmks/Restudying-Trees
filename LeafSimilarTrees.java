import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://leetcode.com/problems/leaf-similar-trees/description/
public class LeafSimilarTrees extends Tree {

	public static void main(String[] args) {
		LeafSimilarTrees leafSimilarTrees = new LeafSimilarTrees();

		System.out.println(leafSimilarTrees.leafSimilar(leafSimilarTrees.Example2(), leafSimilarTrees.Example2()));

	}

	public boolean leafSimilar(Node root1, Node root2) {
		Queue<Integer> list = new LinkedList<Integer>();
		list = findAllLeafs(root1, list);

		return checkLeafs(root2, list);
	}

	private Queue<Integer> findAllLeafs(Node root1, Queue<Integer> list) {
		if (root1 == null)
			return null;

		if (root1.left == null && root1.right == null) {
			list.add(root1.value);
		}

		findAllLeafs(root1.left, list);
		findAllLeafs(root1.right, list);

		return list;
	}

	private boolean checkLeafs(Node root1, Queue<Integer> list) {
		
		if( root1 == null) 
			return true;
		
		
		if(root1.left == null && root1.right == null) {
			if(root1.value !=list.peek())
					return false;
			else {
				list.poll();
				return true;
			}
			
		}
		checkLeafs(root1.left, list);
		checkLeafs(root1.right, list);
		if(list.isEmpty())
			return true;
		else
			return false;
		
}

}
