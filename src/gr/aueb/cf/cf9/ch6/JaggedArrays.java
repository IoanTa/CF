package gr.aueb.cf.cf9.ch6;
/*
πινακες με διαφορετική διάσταση σε κάθε γραμμη
 */
public class JaggedArrays {
    public static void main(String[] args) {
        int[][] arr = new int[3][];

        arr[0] = new int[3];
        arr[1] = new int[5];
        arr[2] = new int[10];

        for (int i =0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

        for (int[] row :arr) {
            for (int el : row) {
                System.out.println(el + " ");
            }
            System.out.println();
        }
    }
}
