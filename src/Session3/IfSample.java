package Session3;

import java.util.Scanner;

public class IfSample {
    public static void main(String[] args) {
        System.out.println("If statement sample");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = scanner.nextInt();
        //        int score = 75;
        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >= 80) {
            System.out.println("Grade B");
        } else if (score >= 70) {
            System.out.println("Grade C");
        } else if (score >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }
        scanner.close();

        if (1==1) {
            System.out.println("Statement is true");
        } else {
            System.out.println("Statement is false");
        }
    }
}
