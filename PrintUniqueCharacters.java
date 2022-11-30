package Week3.Day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacters {

	public static void main(String[] args) {
		
		String name1 = "kavi kavya";
		char[] nameArray1 = name1.toCharArray();
		
		Set<Character> nameSet = new HashSet<Character>();
		
		for(int i = 0; i < nameArray1.length; i++) {
			boolean add = nameSet.add(nameArray1[i]);
			if(!add) {
				nameSet.remove(nameArray1[i]);
			}
		}
		
		System.out.println(nameSet);
	}}

