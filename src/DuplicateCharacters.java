// Program to display repitative characers from a String

public class DuplicateCharacters {

	public static void main(String[] args) {

		String name = "malayalam";
		String output = "";
		String repetiveCharacters = "";
		// System.out.println(name.length());
		
		char repiChar [] = new char[10];

		for (int i = 0; i < name.length(); i++) {

			int count = 0;

			for (int j = 0; j < output.length(); j++) {
				if (output.charAt(j) == name.charAt(i)) {

					count = 1;
					
					  
					
					repiChar = repetiveCharacters.toCharArray();
				}
			}
			if (count == 0) {

				output = output + name.charAt(i);
			}
		}
		System.out.println("String without duplicate characters : " + output);
		
		System.out.println("Repetive character are : " + repetiveCharacters);
		
		System.out.println("Repetive character are : ");
		
		for (char c : repiChar ) {
			System.out.print(c + ",");
		}
	}

}
