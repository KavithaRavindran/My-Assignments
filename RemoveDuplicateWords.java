package Week3.Day2;

import java.util.HashSet;
import java.util.Set;


public class RemoveDuplicateWords {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		
		Set<String> obj1 = new HashSet<String>();
		
		for(int i = 0; i < split.length; i++) {
			obj1.add(split[i]);
		}
		
		System.out.println(obj1);

	}

}