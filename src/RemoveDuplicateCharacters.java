
public class RemoveDuplicateCharacters {

	public static void main(String[] args) {

		String name = "malayalam";
		String output = "";                                                                              

		for (int i = 0; i < name.length(); i++) {
			int count = 0;
			for (int j = 0; j < output.length(); j++) {
				if (output.charAt(j) == name.charAt(i)) {
					count = 1;
				}
			}
			if (count == 0) {
				output = output + name.charAt(i);
			}
		}
		System.out.println("String without duplicate characters : " + output);
	}
}
