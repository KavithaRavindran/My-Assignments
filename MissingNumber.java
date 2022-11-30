package Week3.Day2;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3,4, 5, 3, 5, 6, 8, 9, 9, 2, 5, 4, 8, 1,3};
		
		Set<Integer> num1 = new TreeSet<Integer>();
		for(int i = 0; i < numbers.length; i++) {
			num1.add(numbers[i]);
		}
		System.out.println("Set Values: "+num1);
		for(int i = 1; i < num1.size(); i++) {
			if(!num1.contains(i)) {
				System.out.println("Missing Number: "+i);
			}
		}

	}

}