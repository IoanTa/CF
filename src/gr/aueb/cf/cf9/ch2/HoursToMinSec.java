package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

public class HoursToMinSec {
    public static void main(String[] args) {
        final int MINUTES_IN_HOUR = 60;
        final int SECONDS_IN_HOUR = 3600;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        //Πάρε μεταβλητή - data bind
        System.out.println("Please enter the number of hours you want to convert: ");
        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();

        //Επεξεργασία του input
        minutes = hours * MINUTES_IN_HOUR;
        seconds = hours * SECONDS_IN_HOUR;

        //Δώσε στον χρήστη αποτέλεσμα
        System.out.printf("There are %d minutes in %d hour/hours\n", minutes, hours);
        System.out.printf("There are %d seconds in 5d hour/hours\n", seconds, hours);
    }
}
