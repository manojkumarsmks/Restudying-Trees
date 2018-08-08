// https://leetcode.com/problems/path-sum-ii/description/
import java.util.ArrayList;
import java.util.List;

public class PathSumII extends Tree{
	List<List<Integer>> list = new ArrayList<List<Integer>>();
    List<Integer> temp = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PathSumII pathSumII = new PathSumII();
		List<List<Integer>> list = pathSumII.pathSum(pathSumII.Example1(), 22);
		
		for (List<Integer> list2 : list) {
			for (Integer integer : list2) {
				System.out.println(integer);
			}
			
			System.out.println("-------------------------");
		}
	}
	
	public List<List<Integer>> pathSum(Node root, int sum) {
        
	if(root != null) {
			
		if(root.left == null && root.right == null) {
				
				if(root.value == sum)
					list.add(temp);
				else {
					if(temp.size() >=1) {
						temp.remove(temp.size()-1);
					}
				}
			}
			
			temp.add(root.value);
			pathSum(root.left, sum-root.value);
			pathSum(root.right, sum-root.value);
			
			return list;
			
		}
		return list;
		
    }

}
