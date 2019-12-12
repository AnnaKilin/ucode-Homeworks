package Palindrome;
import java.util.Scanner;


public class Palindrome {


    public static void main (String []args) {
            Scanner sc = new Scanner(System.in);

            long palindrome = sc.nextLong();

            if(isPalindrome(palindrome) == true) {
                System.out.println("The number is palindrome");
            } else System.out.println("The number is not palindrome");
    }

    public static boolean isPalindrome(long number) {
        long palindrome = number;
        long reverse = 0;

        // Compute the reverse
        while (palindrome != 0) {
            long remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // The integer is palindrome if integer and reverse are equal
        return number == reverse;

    }


}
