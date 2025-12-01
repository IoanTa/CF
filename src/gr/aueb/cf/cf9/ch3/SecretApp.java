package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class SecretApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 42;
        int num = 0;

        System.out.println("Guess the secret number yoohoo: ");
        num = scanner.nextInt();

        if (num == SECRET) {
            System.out.println("Yay");
        } else {
            System.out.println("wrong!");
        }

    }
}
