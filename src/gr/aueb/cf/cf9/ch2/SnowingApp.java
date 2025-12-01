package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

public class SnowingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isItSnowing = false;
        boolean isItRaining = false;
        int temperature = 0;

        System.out.println("Is it raining outside? (true/false) ");
        isItRaining = scanner.nextBoolean();
        System.out.println("What is the temperature outside? ");
        temperature = scanner.nextInt();
        isItSnowing = isItRaining && (temperature < 0);
        System.out.println("Is Snowing: " + isItSnowing);

    }
}
