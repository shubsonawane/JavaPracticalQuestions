// Program to remove duplicate Characters from a String.

import java.util.LinkedHashSet;
import java.util.Set;

public class DupCharInStr {

	public static void main(String[] args) {
		String string = "aabbccdefatafaz";

		char[] chars = string.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
		    charSet.add(c);
		}
		
	    System.out.println(charSet.toString());	
	   
		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
		    sb.append(character);
		    
		}
		System.out.println("String without duplicate characters : " + sb.toString());
		System.out.println("Reverse String : " + sb.reverse());
	}

}
