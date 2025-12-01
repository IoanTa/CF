package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class Menu2App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 1;

        while (true) {
            System.out.println("Please choose: ");
            System.out.println("1. Apply");
            System.out.println("2. Delete application");
            System.out.println("3. Exit program");
            choice = scanner.nextInt();
            if (choice == 3) {
                break;
            }
        }
        System.out.println("Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice, Mike Joice");
    }
}
