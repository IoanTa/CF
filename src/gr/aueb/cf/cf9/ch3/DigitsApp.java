package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class DigitsApp {
    public static void main(String[] args) {
        int num = 0;
        int digits = 0;
        int inputNum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = scanner.nextInt();

        inputNum = num;
        do {
            digits++;
            num /= 10;
        } while (num > 0);
        System.out.printf("%d has %d digit/s", inputNum, digits);


//        if (num < 10) {
//            System.out.println("1");
//        } else if (num < 100) {
//            System.out.println("2");
//        } else if (num < 1000) {
//            System.out.println("3");
//        } else if (num < 10000) {
//            System.out.println("4");
//        } else if (num < 100000) {
//            System.out.println("5");
//        } else if (num < 1000000) {
//            System.out.println("6");
//        } else if (num < 10000000) {
//            System.out.println("7");
//        } else if (num < 100000000) {
//            System.out.println("8");
//        } else if (num < 1000000000) {
//            System.out.println("9");
//        }


    }
}
