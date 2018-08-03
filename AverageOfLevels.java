// https://leetcode.com/problems/average-of-levels-in-binary-tree/description/
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevels extends Tree{

	public static void main(String[] args) {
		AverageOfLevels averageOfLevels = new AverageOfLevels();
		List<Double> result = averageOfLevels.averageLevel(averageOfLevels.Example1());
		
		for (Double double1 : result) {
			System.out.println(double1);
		}
	}
	
	public List<Double> averageLevel(Node root) {
		List<Double> result = new ArrayList<>();
		
		if(root == null)
			return null;
		
		Queue<Node> queue = new LinkedList<>();
		List<Node> temp = new ArrayList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			
			int size = queue.size();
			int avg = 0;
			
			while(!queue.isEmpty()) {
				temp.add(queue.poll());
			}
			
			for (int i = 0; i < temp.size(); i++) {
				Node tempNode = temp.get(i);
				avg += tempNode.value;
				
				if(tempNode.getLeft() != null)
					queue.add(tempNode.getLeft());
				if(tempNode.getRight() != null)
					queue.add(tempNode.getRight());
				
			}
			
			result.add( ((double)avg/(double)size));
			temp.clear();
			
		}
		
		return result;
		
	}

}
