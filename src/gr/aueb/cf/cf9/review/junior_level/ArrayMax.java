package gr.aueb.cf.cf9.review.junior_level;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
//        int[] arr = {1, 5, 10, 36, 84, 32};
//        System.out.println("Max number is: " + Arrays.stream(arr).max().getAsInt());


//        Scanner scanner = new Scanner(System.in);
//        int[] arr = {};
//        System.out.println("Please enter an array of numbers: ");
//        arr = Arrays.stream(Arrays.stream(scanner.nextLine().split(" ")).toArray());

        int[] arr = {1, 7, 15, 76, 23, 90, 145, 9};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

    }

}
