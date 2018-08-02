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
		boolean deciderFlag = false;
		
		if(root != null)
			//queue.add(root);
			stack.push(root);
		
		List<Node> list = new ArrayList<Node>();
		stack.add(root);
		
		while(true) {
			
			while(!stack.isEmpty())
				list.add(stack.pop());
			
			if(!deciderFlag) {

			}
			
		}
	}
}
