package gr.aueb.cf.cf9.ch2;
/*
Ο χρήστης εισάγει έναν ακέραιο που συμβολίζει μια θερμοκρασία
Και το προγραμμα υπολογίζει αν η θερμοκρασία < 0 τότε μεταβλιτή γίνεται true,
αλλιώς false.
 */


import java.util.Scanner;

public class TemperatureApp {
    public static void main(String[] args) {

        //Δήλωση και αρχηκοποίηση
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean tempBelow0 = false;

        //Εισαγωγή δεδομένων
        System.out.println("Please enter the current temperature: ");
        temperature = scanner.nextInt();

        //Επεξεργασία δεδομένων
        tempBelow0 = temperature < 0;

        //Εκτύπωση των αποτελεσμάτων
        System.out.println("The current temperature is below 0: " + tempBelow0);

    }
}
