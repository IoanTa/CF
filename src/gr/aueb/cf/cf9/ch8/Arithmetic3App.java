package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

public class Arithmetic3App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int rslt = 0;

        while (true) {
            System.out.println("Please enter two numbers (0 to exit): ");
            num1 = scanner.nextInt();
            if (num1 == 0) break;
            num2 = scanner.nextInt();
            //validation instead of try catch
            if (num2 == 0) {
                System.out.println("Cannot be 0");
                continue;
            }

            rslt = num1 / num2;
            System.out.println("Result = " + rslt);

        }
    }
}
