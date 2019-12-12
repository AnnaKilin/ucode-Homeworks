package SimilarDigits;

import java.util.Scanner;

public class SimilarDigits {
    public static void main (String [] args){
        int number1;
        int number2;

        Scanner sc = new Scanner(System.in);

        number1 = sc.nextInt();
        number2 = sc.nextInt();

        String str1 = Integer.toString(number1);
        char first1 = str1.charAt(0);
        char last1 = str1.charAt(str1.length()-1);


        String str2 = Integer.toString(number2);
        char first2 = str2.charAt(0);
        char last2 = str2.charAt(str2.length()-1);


        if( first1 == first2 && last1 == last2)
            System.out.println("Number (number 1) and number (number 2) have the same first and last digits");
        else
            System.out.println("Number (number 1) and number (number 2) don't have the same first and last digits");

    }


}
