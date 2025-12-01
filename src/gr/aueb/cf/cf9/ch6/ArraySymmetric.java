package gr.aueb.cf.cf9.ch6;
/*
[1, 2, 3, 4, 3, 2, 1] <-- Symetric
[1, 2, 3, 4, 5, 6, 7] <-- Asymetric
 */
public class ArraySymmetric {
    public static void main(String[] args) {

    }

    public static boolean isArraySymmetric(int[] arr) {
        boolean isSymetric = true;

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }
}
