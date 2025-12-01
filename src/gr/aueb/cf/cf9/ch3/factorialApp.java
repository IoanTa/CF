package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/*
calculates factorial of a number
 n! = 1 * 2 * 3 * 4 * 5 * 6 * ... * n
for instance 5! = 1 * 2 * 3 * 4 * 5 = 120
 */
public class factorialApp {
    public static void main(String[] args) {
        int num = 0;
        int fct = 1;
        int i = 1;

        System.out.println("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        while (i <= num) {
            fct *= i;
            i++;
        }

        System.out.printf("%d! = %d",num, fct);
    }
}
