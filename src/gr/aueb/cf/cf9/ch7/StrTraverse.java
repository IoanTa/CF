package gr.aueb.cf.cf9.ch7;
/*
Traverses a string
one by one character by character
without using the enhanced for loop
 */
public class StrTraverse {
    public static void main(String[] args) {
        String str = "Coding Factory";

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " ");
        }

        for (int i = str.length(); i <=0; i--) {
            System.out.println(str.charAt(i) + " ");
        }
    }
}
