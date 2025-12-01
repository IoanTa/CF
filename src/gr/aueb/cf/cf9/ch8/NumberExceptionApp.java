package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

/*
Το {@link NumberFormatException} σημβαίνει όταν
αποτυγχάνει η {@link Integer#parseInt(String)}
 */
public class NumberExceptionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = " ";
        int num = 0;

        System.out.println("Please enter a number: ");
//        input = scanner.nextLine();
        while (!isInteger(input = scanner.nextLine())) {
            System.out.println("These characters are accepted");
        }
        num = Integer.parseInt(input);
        System.out.println("The number is: " + num);

        num = Integer.parseInt(input);
        System.out.println("The number is: " + num);
    }
/*
Checks if the given String is an initeger
@param str    The string to check
@return       True if the string is an integer, false otherwise
 */
    public static boolean isInteger(String str) {
        return str.matches("-?[0-9]+");
    }
}
