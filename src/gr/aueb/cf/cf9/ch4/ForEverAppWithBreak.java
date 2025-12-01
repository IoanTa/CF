package gr.aueb.cf.cf9.ch4;

public class ForEverAppWithBreak {
    public static void main(String[] args) {
        int i = 0;
        final int MAX = 100;
        for (;;) {
            System.out.print("Forever");
            i++;
            if (i % 20 == 0) System.out.println();
            if (i == MAX) break;
        }
    }
}
