package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class FactorialApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int factorial = 0;

        System.out.println("Please select a number: ");
        num = scanner.nextInt();

        factorial = facto(num);


    }

    public static int facto(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= 1;

        }
        return factorial;
    }
}
