public class Palindrome {
    public static void main(String args[]) {
        int number = 121;
        int newNumber = number;
        int rem;
        int rev = 0;

        while (newNumber > 0) {
            rem = newNumber % 10;
            rev = (rev * 10) + rem;
            newNumber = newNumber / 10;
        }

        if (number == rev) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is NOT Palindrome");
        }
    }
}
