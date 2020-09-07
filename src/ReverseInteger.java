
public class ReverseInteger {

    public static void main(String[] args) {

        int num = 1234, reversed = 0;
        
        int originalNum = 1234;

        while(num != 0) {
            int rem = num % 10;
            System.out.println("\nRemainder = " + rem);
            reversed = reversed * 10 + rem;
            System.out.println("reverser = " + reversed);
            num /= 10;
            System.out.println("Quotient = " + num);
        }

        System.out.println("\nReversed Number: " + reversed);
        
        
        if (reversed == originalNum)
        	System.out.println("Number is palindrome");
        else
        	System.out.println("Number is not palindrome");
    }
}