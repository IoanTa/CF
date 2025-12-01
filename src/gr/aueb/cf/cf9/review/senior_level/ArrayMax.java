package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/*
Checks which number is the maximum in a list
 */
public class ArrayMax {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner sc = new Scanner(System.in);
        final int SIZE = 5;
        int[] numbers = new int[SIZE];
        int maxPosition = 0;
        int maxValue = 0;

        System.out.println("Please enter 5 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            //reads and validates user input
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number: ");
                sc.nextLine();
            }
            numbers[i] = sc.nextInt();
        }
        maxPosition = getMax(numbers);
        maxValue = numbers[maxPosition];
        System.out.printf("The maximum value is %d at position %d", maxValue, maxPosition);
    }

/*
find the position of the maximum value in an array list
@param arr the input array
@return
 */
    public static int getMax(int[] arr) {
        if (arr == null || arr.length == 0) return Integer.MIN_VALUE;
        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = 1; i <= arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
