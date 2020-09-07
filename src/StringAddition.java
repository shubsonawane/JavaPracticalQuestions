import java.util.Random;

public class StringAddition {

	public static void main(String[] args) {

		String str1 = "10,000";
		String str2 = "1,000";

		// int addition = Integer.parseInt(str1) + Integer.parseInt(str2);

		String num1 = str1.replace(",", "");
		String num2 = str2.replace(",", "");
		// System.out.println("Num1 : " + num1);

		Integer add = Integer.parseInt(num1) + Integer.parseInt(num2);
		
		System.out.println("Addition : " + add);
		
		Random randomNum = new Random();

		System.out.println(randomNum.nextInt(999));

	}

}
