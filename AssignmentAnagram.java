package Week2.Day2;
import java.util.Arrays;

public class AssignmentAnagram {

public static void main(String[] args) {
		
			String text1 = "stops";
			String text2 = "potss";
			boolean status = false;
			if(text1.length()!=text2.length()) {
				System.out.println("It is not an anagram");
			}
			else {
				char[] ArrayS1 = text1.toLowerCase().toCharArray();
				char[] ArrayS2 = text2.toLowerCase().toCharArray();
				Arrays.sort(ArrayS1);
				Arrays.sort(ArrayS2);
				status = Arrays.equals(ArrayS1, ArrayS2);
			}
			if(status)
				System.out.println("Anagram");
			else
				System.out.println("It is not an anagram");

	}

}
