package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/*
Εμφανίζει μενου μέχρι να πατηθεί του κουμπί exit
 */
public class MenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 1;

        do {
            System.out.println("Please choose: ");
            System.out.println("1. Apply");
            System.out.println("2. Delete application");
            System.out.println("3. Exit program");
            choice = scanner.nextInt();
        } while (choice != 3);

        System.out.println("Bye-bye");
    }
}
