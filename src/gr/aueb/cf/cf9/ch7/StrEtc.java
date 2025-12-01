package gr.aueb.cf.cf9.ch7;

public class StrEtc {
    public static void main(String[] args) {
        String s = "Coding Factory";

        for (char ch : s.toCharArray()) {
            System.out.println(ch + " ");
        }

        System.out.println("\u2764");
    }

    String firstName = "Maria-Helen";
    String simpleName = firstName.replace("-", " ");

    String lastName = "Smith";
    String fullName1 = firstName + " " + lastName;
    String fullName2 = firstName.concat(" ").concat(lastName);
}
