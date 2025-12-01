package gr.aueb.cf.cf9.ch8;
/*
Η {@link BankApp} παρεχει μια μονο υπηρεσια, την υπηρεσια κατάθεσης
 */

import java.time.LocalDateTime;
import java.util.Scanner;

public class BankApp {
    static double balance = 0.0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = 0.0;
        try {
            System.out.println("Enter an amount to deposit: ");
            amount = scanner.nextDouble();
            deposit(amount);
            System.out.println("The rest of your deposite is: " + amount);
        } catch (Exception e) {
            System.out.println("Amount cannot be negative");

        }

    }
/*
Deposit on amount of money.
@param ammout
@throws Exception
 */
    public static void deposit(double amount) throws Exception {
        try {
            if (amount < 0) throw new Exception("Amount cannot be negative");
        } catch (Exception e) {
            System.err.println(LocalDateTime.now() + "\n" + e.getMessage()); //logging
            throw e;        //re-throwing the exception
        }

    }
}
