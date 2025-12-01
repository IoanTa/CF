package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

public class PowerApp {
    public static void main(String[] args) {
        int base = 0;
        int power = 0;
        int result = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a number for the base: ");
        base = scanner.nextInt();
        System.out.println("Now give a number for the power: ");
        power = scanner.nextInt();

        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        System.out.printf("%d ^ %d = %d", base, power, result);
    }
}
