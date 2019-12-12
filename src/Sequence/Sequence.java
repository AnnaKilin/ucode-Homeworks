package Sequence;

import java.util.Scanner;

public class Sequence {
    public static void main ( String[] args){
        Scanner sc = new Scanner(System.in);

        long number = sc.nextLong();
        if( increasingDigits(number) == true || decreasing(number) == true)
            System.out.println("yes");
        else System.out.println("no");
    }

    public static boolean increasingDigits(long input)
    {
        if (input < 0)
            input = -input;

        long lastSeen = 10;
        long current;

        while (input > 0) {
            current = input % 10;
            if (lastSeen < current)
                return false;
            lastSeen = current;
            input /= 10;
        }
        return true;


    }

    public static boolean decreasing(long input)
    {

        if (input < 0)
            input = -input;

        long lastSeen = 0; // always greater than any digit
        long current;

        while (input > 0) {
            current = input % 10;
            if (lastSeen > current)
                return false;
            lastSeen = current;
            input /= 10;
        }
        return true;
    }


}
