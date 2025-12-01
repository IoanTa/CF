package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/*
Ο χρήστης δίνει την ηλικία του σε έτη και το προγραμμα επιστρέφει την ηλικία του σε ημέρες!
 */
public class YearsToDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int DAYS_IN_YEAR = 365;
        int ageInYears = 0;
        int ageInDays = 0;

        System.out.println("Please enter your age: ");
        ageInYears = scanner.nextInt();
        ageInDays = ageInYears * DAYS_IN_YEAR;

        System.out.printf("Age in years: %d, Age in days: %d\n", ageInYears, ageInDays);

    }
}
