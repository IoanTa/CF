package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/*
Να υπολογίζει την δύναμη ενός αριθμού
 */
public class PowerMethodApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        System.out.println("Please enter a number: ");


        num1 = scanner.nextInt();

        System.out.println("Please enter the power ");
        num2 = scanner.nextInt();
        result = pwr(num1, num2);

    }

    public static int pwr(int num1, int num2) {
        int result = 1;
        for (int i = 1; i <= num2; i++) {
            result *= num1;
        }
        System.out.println("num1^num2 = " + result);
        return result;
    }
}
