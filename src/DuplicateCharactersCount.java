
public class DuplicateCharactersCount {
	public static void main(String[] args) {

		String inputStr = "aaabbbbccccccdd";
		String result = "";
		StringBuilder sb = new StringBuilder(inputStr);

		while (sb.length() != 0) {
			int count = 0;
			char test = sb.charAt(0);
			while (sb.indexOf(test + "") != -1) {
				sb.deleteCharAt(sb.indexOf(test + ""));
				count++;
			}
			System.out.println(test+" is repeated "+count+" number of times");
			result = result + test + count;
		}
		System.out.println(result);
	}
}