package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

public class StrConCat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = "";
        int age = 0;
        String message = "";

        //Info input with validation and data binding
        System.out.println("Please enter your first name: ");
        firstName = sc.nextLine();
        System.out.println("Please enter your age");
        while (!sc.hasNextInt()){
            System.out.println("Please enter a number: ");
            sc.nextLine();
        }
        age = sc.nextInt();

        //call service method
        message = createMessage(firstName, age);
        //Output
        System.out.println(message);

    }
    /*
    Create a message that contains the name of the user and the age
    @param firstname
    @param age
    @return
     */
    public static String createMessage(String firstName, int age) {
        return String.format("Hello my name is %s and I am %d years old!", firstName, age);
    }
}
