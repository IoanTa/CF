package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class PositiveCountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int positives = 0;

        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        while (num <= num) {
            positives++;
            System.out.println("Please enter a number: ");
            num = scanner.nextInt();

        }

        System.out.printf("The count of positive numbers is: %d", num);
    }
}
