import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

// https://leetcode.com/problems/most-frequent-subtree-sum/description/
public class MostFrequencySubtreeSum extends Tree{
	static List<Integer> listLeft = new ArrayList<>();
	static HashMap<Integer, Integer> map = new HashMap<>();

	public static void main(String[] args) {
		MostFrequencySubtreeSum mostFrequencySubtreeSum = new MostFrequencySubtreeSum();
		mostFrequencySubtreeSum.findFrequentTreeSum(mostFrequencySubtreeSum.Example1());
		
		Set<Integer> set = map.keySet();
		
		for (Integer integer : set) {
			System.out.println(map.get(integer));
		}
	}

	public void findFrequentTreeSum(Node root) {
		if(root != null) {
			findFrequentTreeSum(root.left);
			findFrequentTreeSum(root.right);
			int temp = listOfSubtreeSum(root);
			if(map.containsKey(temp))
				map.put(temp, map.get(temp)+1);
			else 
				map.put(temp, 1);
		}
	}

	private int listOfSubtreeSum(Node root) {

		if (root == null)
			return 0;
		
		return root.value + listOfSubtreeSum(root.left) + listOfSubtreeSum(root.right);

	}

}
