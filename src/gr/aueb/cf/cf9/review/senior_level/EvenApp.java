package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;
/*
This program checks if a number is even or not
 */
public class EvenApp {
    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean result = false;

        //Είσοδος δεδομένων με validation και data binding
        System.out.println("Please enter a number: ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter a number: ");
            sc.nextLine();
        }
        num = sc.nextInt();

        //Επιχειρισιακή λογική (business logic)
        result = isEven(num);

        //Εκτήπωση αποτελέσματος
        System.out.println("The number is even: " + result);
    }
    /*
    Checks if numbers is even
    @param num the number to check
    @return true if even, false otherwise
     */
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
