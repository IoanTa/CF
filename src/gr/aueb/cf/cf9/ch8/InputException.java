package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

/*
Το @link java.util.InputMismatchException σημβαίνει όταν ο {@link java.util.Scanner} αποτυγχάνει να διαβλασει
το σωστό τύπο δεδομένων.
 */
public class InputException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please enter one int ");
//        num = scanner.nextInt();

        while (!scanner.hasNextInt()) {
            System.out.println("Not valid characters!");
            scanner.next();
        }

        System.out.println("Num: " + num);
    }
}
