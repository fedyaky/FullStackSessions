package Session3;

import java.util.Scanner;

public class StudentManagmentSystem {
    public static void main(String[] args) {
        System.out.println("+ + + Student Menu + + +");
        Scanner scanner = new Scanner(System.in);

        int studentId = 0;
        String firstName = "";
        String lastName = "";
        int studentAge = 0;

        while (true) {
            System.out.println("1. Enter student details");
            System.out.println("2. Display student details");
            System.out.println("3. Reset student data");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice");
//                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("Enter student ID: ");
                    studentId = scanner.nextInt();
                    if (studentId < 0 && studentId > 100) {
                        System.out.println("Invalid student ID");
                        break;
                    }
                    scanner.nextLine();
                    System.out.println("Enter student first name: ");
                    firstName = scanner.nextLine();
                    if (firstName.length() < 2) {
                        System.out.println("Invalid first name");
                        break;
                    }
                    System.out.println("Enter student last name: ");
                    lastName = scanner.nextLine();
                    System.out.println("Enter student age: ");
                    studentAge = scanner.nextInt();
                    System.out.println("Student details saved successfully");
                    break;
                case 2:
                    System.out.println("+++Student details+++");
                    System.out.println("Student ID: " + studentId);
                    System.out.println("Student Name: " + firstName + " " + lastName);
                    System.out.println("Student Age: " + studentAge);
                    System.out.println("+++End of Student details+++");
                    break;
                case 3:
                    studentId = 0;
                    firstName = "";
                    lastName = "";
                    studentAge = 0;
                    System.out.println("Student data has been reset");
                    break;

                case 4:
                    System.out.println("Exit");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }
    }
}
