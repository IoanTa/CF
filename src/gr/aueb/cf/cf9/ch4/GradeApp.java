package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

public class GradeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = 0;
        final int EXIT = 10;

        System.out.println("Please enter your grade: ");
        do {
            grade = scanner.nextInt();
            switch (grade){
                case 1:
                    System.out.println("Your grade is 1. You have failed");
                    break;
                case 2:
                    System.out.println("Your grade is 2. You have failed");
                    break;
                case 3:
                    System.out.println("Your grade is 3. You have failed");
                    break;
                case 4:
                    System.out.println("Your grade is 4. You have failed");
                    break;
                case 5:
                    System.out.println("Your grade is 5. You got a passing grade");
                    break;
                case 6:
                    System.out.println("Your grade is 6. You got an average grade");
                    break;
                case 7:
                    System.out.println("Your grade is 7. You got a good grade");
                    break;
                case 8:
                    System.out.println("Your grade is 8. You got a great score");
                    break;
                case 9:
                    System.out.println("Your grade is 9. You passed with an amazing score");
                    break;
                case 10:
                    System.out.println("YOU PASSED WITH FLYING COLORS!!");
                    break;
                default:
                    System.out.println("ERROR!!");
                    break;
            }
        } while (grade != EXIT);
        System.out.println("Goodbye");
    }
}
