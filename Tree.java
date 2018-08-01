import java.util.Stack;

// Tree Re-Studying
public class Tree {

	public static void main(String[] args) {

	}
//-------------------------------------------------------------------------------------------	
	// Pre-Order Traversal
	public void preOrderRecursive(Node root) {
		
		if(root != null) {
			System.out.println(root.getValue());
			preOrderRecursive(root.getLeft());
			preOrderRecursive(root.getRight());
		}
		
	}
	
	public void preOrderIterative(Node root) {
		if(root == null)
			return;
		
		Stack<Node> stack = new Stack<Node>();
		
		stack.push(root);
		
		while(!stack.isEmpty()) {
			Node temp = stack.pop();
			
			System.out.println(stack.pop());
			
			if(temp.getRight() != null) {
				stack.push(temp.getRight());
			}
			if(temp.getLeft()!= null) {
				stack.push(temp.getLeft());
			}
		}	

	}
//-------------------------------------------------------------------------------------------
	// In-Order Traversal
	public void InOrderRecursive(Node root) {
		
		if(root != null) {
			InOrderRecursive(root.left);
			System.out.println(root.value);
			InOrderRecursive(root.right);
		}
	}
	
	public void InOrderIterative(Node root) {
		if(root == null)
			return;	
		Stack<Node> stack = new Stack<Node>();
		while(true) {
			
			if(root != null) {
				stack.push(root);
				root = root.getLeft();
			}
			else {
				if(stack.isEmpty())
					break;
				root = stack.pop();
				System.out.println(root.getValue());
				root = root.getRight();
			}
		}
	}
	
//-------------------------------------------------------------------------------------------
	// Post-Order Traversal
	
	public void PostOrderRecursive(Node root) {
		
		if(root != null) {
			PostOrderRecursive(root.getLeft());
			PostOrderRecursive(root.getRight());
			System.out.println(root.value);
		}
		
	}
//-------------------------------------------------------------------------------------------
	// Tree example
	
	public Node TreeExample() {
		
		Node root = new Node(10);
		
		root.left = new Node(12);
		
		root.right = new Node(15);
		
		root.left.left = new Node(25);
		root.left.right = new Node(30);
		root.left.right.left = new Node(8);
		root.left.right.left.left = new Node(5);
		root.left.right.left.left.right = new Node(1);
		
		root.right.left = new Node(36);
		root.right.left.right = new Node(244);
		
		return root;
		
		
	}
	

}

class Node {
	
	int value;
	Node left;
	Node right;
	
	public Node(int value) {
		setValue(value);
	}
	
	public int getValue() {
		return value;
	}
	public Node getLeft() {
		return left;
	}
	public Node getRight() {
		return right;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public void setRight(Node right) {
		this.right = right;
	}

}
