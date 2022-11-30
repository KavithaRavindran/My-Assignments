package Week3.Day2;

import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {


		int[] data1 = {3,2,11,4,6,7,2,3,3,6,7};
		
		Set<Integer> numSet = new TreeSet<Integer>();
		
		for(int i=0; i< data1.length;i++) {
			numSet.add(data1[i]);
		}
		System.out.println(numSet);
		
		//Find the Second Largest
		int n = numSet.size() - 2;
		int currentIndex = 0;
		
		for (Integer second : numSet) {
			if (currentIndex == n)
            {
				System.out.println("Second Largest Number in the set: " +second);
                break;
            }
            currentIndex++;
			
		}
		

	}

}