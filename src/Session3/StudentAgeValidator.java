package Session3;

import java.util.Scanner;

public class StudentAgeValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter your number: ");
            int age = scanner.nextInt();
            if (age >= 0 && age <= 100) {
                System.out.println("Valid age");
                } else {
                System.out.println("invalid age");
                break;
            }

        }
        scanner.close();}
}
