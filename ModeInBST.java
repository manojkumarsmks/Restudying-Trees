// https://leetcode.com/problems/find-mode-in-binary-search-tree/description/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class ModeInBST extends Tree{

	HashMap<Integer,Integer> map = new HashMap<>();
	
	public static void main(String[] args) {
			ModeInBST modeInBST = new ModeInBST();
			modeInBST.findModeInBST(modeInBST.TreeExample());
			
	}
	
	public int[] findModeInBST(Node root) {
		
		int mode = 0;
		InOrderTraversal(root);
		List<Integer> list = new ArrayList<>();
		
		Set<Integer> set=map.keySet();
		
		for(Integer temp:set) {
			if(map.get(temp) > mode) 
				mode = map.get(temp);
		}
		
		for(Integer temp:set) {
			if(map.get(temp) == mode) 
				list.add(temp);
		}
		
		int[] result = new int[list.size()];
		
		for (int i = 0; i < result.length; i++) {
			result[i] = list.get(i);
		}
		
		
		return result;
	}

	private void InOrderTraversal(Node root) {
		
		InOrderIterative(root.left);
		
		if(map.containsKey(root.value)) {
			map.put(root.value, map.get(root.value)+1);
		}
		else {
			map.put(root.value, 1);
		}
		
		InOrderIterative(root.right);
		
	}

}
