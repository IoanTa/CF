package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class DivisionApp {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int rslt = 0;
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Please enter a numerator: ");
            num1 = scanner.nextInt();
            if (num1 == 0) {
                System.out.println("Numerator is 0! YOU ARE DESTROYING MY CURRENT EXISTANCE BY PUTTING 0! Quitting...");
                break;
            }

            System.out.println("Please enter a demoninator: ");
            num2 = scanner.nextInt();

            if (num2 == 0) {
                System.out.println("CANNOT BE DEVIDED BY 0!!!! >:(");
                continue;
            }

            rslt = num1 / num2;
            System.out.printf("Your result is: %d\n", rslt);
        }


    }
}
