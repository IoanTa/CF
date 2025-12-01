package gr.aueb.cf.cf9.ch7;

public class StrUpperLower {
    public static void main(String[] args) {
        String str = "Athens";
        String str2 = "athens";

        boolean isEqual = str.toUpperCase().equals(str2.toUpperCase());
        boolean isEqual2 = str2.toLowerCase().equals(str2.toLowerCase());
    }
}
