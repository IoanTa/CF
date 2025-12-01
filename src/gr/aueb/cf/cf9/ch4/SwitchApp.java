package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/*
Εμφανίζει μενου στον χρήστη
ο χρήστης δίνει το choise
το επεξεργάζεται
 */
public class SwitchApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        final int EXIT = 4;
        do {
            System.out.println("Please select from below: ");
            System.out.println("1. Solo");
            System.out.println("2. Duos");
            System.out.println("3. Trios");
            System.out.println("4. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Start Solo");
                    break;
                case 2:
                    System.out.println("Start Duos");
                    break;
                case 3:
                    System.out.println("Start Trios");
                    break;
                case 4:
                    System.out.println("Exit game");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;
            }
        } while (choice != EXIT);
        System.out.println("Goodbye");
    }
}
