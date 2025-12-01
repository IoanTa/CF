package gr.aueb.cf.cf9.review.mid_level;

public class ArrayMax {
//    works------------------------------------
//    public static void main(String[] args) {
//
//        int[] arr = {1, 5, 10, 36, 84, 32, 150, 6};
//        System.out.println("Max number is: " + getMax(arr));
//
//    }
//    public static int getMax(int[] arr) {
//        int arrMax = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > arrMax) {
//                arrMax = arr[i];
//            }
//        }
//        return arrMax;
//    }
//    Version 2------------------------------------
    public static void main(String[] args) {

    }
    public static int getMax(int[] arr) {
        if (arr == null || arr.length == 0) return Integer.MIN_VALUE;
        int max = arr[0];
        for (int i = 1; i <= arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
