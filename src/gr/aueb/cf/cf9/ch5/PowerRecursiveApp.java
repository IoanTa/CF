package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class PowerRecursiveApp {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int power = 0;
//        int base = 0;
//        int result = 0;
//
//        System.out.println("Please enter a number for the base: ");
//
//        base = scanner.nextInt();
//
    }

    public static int powerRecursive(int base, int power) {
        if (power == 0) {
            return 1;
        }
        return base * powerRecursive(base, power - 1);
    }
}
