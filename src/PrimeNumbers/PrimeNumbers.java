package PrimeNumbers;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String []args) {

        Scanner keyboard = new Scanner(System.in);
        int number;
        while (true) {

            number = keyboard.nextInt();

            for(int i=0; i<number; i++) {

                if (checkPrime(i) == true)
                    System.out.println("The number is prime: " +i);

            }

        }
    }

    static boolean checkPrime(int n){
        int i,m=0;
        m=n/2;

        if(n==0||n==1){
            return false;
        }
        else {
            for (i=2;i<=m;i++) {
                if (n%i==0) {
                    return false;
                }
            }
        }
    return true;
    }


}
