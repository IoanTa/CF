package gr.aueb.cf.cf9.review.challenges;

import java.util.Scanner;

/*
ενας αριθμος armstrong είναι ενας αριθμος
που ειναι ισος με το αθροισμα των ψηφιων του
οπου το καθε ψηφιο έχει υψωθεί στη δύναμη του αριθμου των ψηφίων του

πχ

153 = 1^3 + 5^3 + 3^3
 */
public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int initiaNum = 0;
        int numberOfDigits = 0;
        int digit = 0;
        int sum = 0;

        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        numberOfDigits = String.valueOf(num).length();

        initiaNum = num;
        while(num != 0) {
            digit = num % 10;
            sum += (int) Math.pow(digit, numberOfDigits);
            num /= 10;
        }
        System.out.printf("%d%s Armstrong\n", initiaNum, (sum == initiaNum) ? " is" : " is not");

    }

}
