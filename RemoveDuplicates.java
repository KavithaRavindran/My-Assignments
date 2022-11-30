package Week3.Day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str = "FriendsFriends";
		char[] ch = str.toCharArray();
		
		Set<Character> obj1 = new HashSet<Character>();
		Set<Character> obj2 = new HashSet<Character>();
		
		for(int i = 0; i < ch.length; i++) {
			boolean add = obj1.add(ch[i]);
			if(!add) {
			obj2.add(ch[i]);
			}
		}
		System.out.println(obj1);
		System.out.println(obj2);
		
		obj1.removeAll(obj2);
		System.out.println("After removing the character which are in dupCharSet:" +obj1);
		
	}

}