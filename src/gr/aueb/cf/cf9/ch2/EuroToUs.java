package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

public class EuroToUs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int EURO_TO_USD = 99;
        int euro = 0;
        int usd = 0;
        int cents = 0;

        System.out.println("Please enter the amount of euros you would like to convert: ");
        euro = scanner.nextInt();

        usd = euro * EURO_TO_USD / 100;
        cents = euro * EURO_TO_USD % 100;


        System.out.printf("%d€ converts to %d.%d$", euro, usd, cents);
    }
}
