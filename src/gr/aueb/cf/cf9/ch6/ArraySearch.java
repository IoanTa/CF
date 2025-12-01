package gr.aueb.cf.cf9.ch6;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {11, 22, 33, 40, 50, 61, 70, 18, 18, 10};
        int value = 0;
        int positionToReturn = 0;
        int position = 0;

        System.out.println("Please enter a number to search for: ");
        value = scanner.nextInt();

        position = getPosition(arr, value);

        if (position == -1) {
            System.out.println("Value not found");
        } else {
            System.out.println("Value: " + value + " found at position: " + (position + 1));
        }
    }


/*
    @param arr
    @param value
    @return
 */


    public static int getPosition(int[] arr, int value) {
        int positionToReturn = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }

    public static int getPosition2(int[] arr, int value) {

        if (arr == null) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return -1;
            }
        }
        return -1;

    }



}
