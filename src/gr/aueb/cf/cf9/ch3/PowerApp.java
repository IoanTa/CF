package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/*
Calculates the power of a number. Example: a^n
 */
public class PowerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int pwr = 0;
        int rslt = 1;
        int i = 1;

        System.out.println("Please enter base and power: ");
        base = scanner.nextInt();
        pwr = scanner.nextInt();

        //While - Do

        while (i <= pwr) {
            rslt *= base;
            i++;
        }

        System.out.printf("%d ^ %d = %d", base, pwr, rslt);

    }
}
