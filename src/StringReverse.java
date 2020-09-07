
public class StringReverse {
	
	public static void main(String[] args) {
		
		String str = "Hello Pune, How are you ?”";
		//int length = str.length();
		//System.out.println(str.charAt(11));
		
		String reverse = "";
		
		for (int i = str.length()-1; i >= 0 ; i--)
		{
			//System.out.println("Ch "+ str.charAt(i));
			
			reverse = reverse + str.charAt(i);
		}
		
		System.out.println("Reverse String : " + reverse);
		
		if (reverse.equals(str)) {
			
			System.out.println("\nString " + str + " is palindrome");
		}
		else {
			System.out.println("\nString " + str + " is not palindrome");
		}
			
	}

}
