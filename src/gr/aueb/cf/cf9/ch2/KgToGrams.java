package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

public class KgToGrams {
    public static void main(String[] args) {
        final int GRAMS_IN_KG = 1000;
        int grams = 0;
        int kg = 0;

        System.out.println("Please enter kg: ");
        Scanner scanner = new Scanner(System.in);
        kg = scanner.nextInt();
        grams = kg * GRAMS_IN_KG;

        System.out.printf("Kg in grams: %,d\n", grams);

    }
}
