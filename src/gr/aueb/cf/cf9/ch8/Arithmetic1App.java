package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

/*
δημιουργείται ένα {@link ArithmeticException}
χωρις να το χειριστούμε
 */
public class Arithmetic1App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int rslt = 0;

        System.out.println("Please enter two valid number: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        rslt = num1 / num2; //Αν το Num2 == 0 θα δώσει ArithmeticException

        System.out.println("Result: " + rslt);


    }

    public static int div(int num1, int num2) {
        return num1 / num2;
    }
}
