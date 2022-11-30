package Week3.Day2;

import java.util.Map;
import java.util.TreeMap;

public class FindNumOccurence {

	public static void main(String[] args) {
		int[] num1 = {2,3,5,6,3,2,1,4,2,1,6,-1};
		Map<Integer, Integer> tree = new TreeMap<Integer, Integer>();
		
		for(int i = 0; i < num1.length; i++) {
			if(tree.containsKey(num1[i])) {
				int value = tree.get(num1[i]);
				tree.put(num1[i], value+1);
			}
			
			else {
				tree.put(num1[i], 1);
			}
		}
		
		System.out.println(tree);

	}

}