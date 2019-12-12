package oddoreven;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String []args) {

        Scanner keyboard = new Scanner(System.in);

        int number;
        while(true) {

            number = keyboard.nextInt();
            if( check(number) == true)
                System.out.println("The number is even");
            else System.out.println("The number is odd");

        }
    }

    public static boolean check(int number) {

        if(number % 2 == 0)
            return true;
        else return false;
    }
}
