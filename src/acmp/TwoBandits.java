package acmp;

import java.util.Scanner;

public class TwoBandits {
    public static void main(String[] args) {
        even_or_odd(19);

    }

    public static String even_or_odd(int number) {
        //Place code here
        if (number % 2 == 0) {
            return "Even";
        }
        if (number % 2 != 0)
            return "Odd";


    }
}
