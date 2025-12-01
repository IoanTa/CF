package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/*
Υπολογίζει το απόλυτο ενός ακεραίου με την χρύση του τριαδικού τελεστή.
Το απόλυτο ενός ακέραιου είναι θετικός αριθμός
 */
public class AbsTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        //Input
        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        //Επεξεργασία δεδομένων
//        if (num >= 0) {
//            abs = num;
//        } else {
//            abs = -num;
//        }

        abs = (num >= 0) ? num: num;

    }
}
