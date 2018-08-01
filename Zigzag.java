// Zig zag traversal
// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Zigzag extends Tree{

	public static void main(String[] args) {
		Zigzag zigzag = new Zigzag();
		zigzag.levelOrderTraversal(zigzag.TreeExample());
	}
	
	public void levelOrderTraversal(Node root) {
		//Queue<Node> queue = new LinkedList<>();
		
		Stack<Node> stack = new Stack<Node>();
		Queue<Node> queue = new LinkedList<>();
		
		
		if(root != null)
			//queue.add(root);
			stack.push(root);
		
		List<Node> list = new ArrayList<Node>();
		
		while(!stack.isEmpty()) {
			while(!stack.isEmpty()) {
				list.add(stack.pop());
			}
			
			for (int i = 0; i < list.size(); i++) {
				Node temp = list.get(i);
				System.out.print(list.get(i).value + "  ");
				
				if(temp.left != null)
					stack.push(temp.left);	
				if(temp.right != null)
					stack.push(temp.right);
				
			}
			
			list.clear();
			
			System.out.println();
			
		}
	}
}
