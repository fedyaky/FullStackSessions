package Session4;

import java.util.Scanner;

public class StudentManagement {

    static class Student {
        int studentId;
        String firstName;
        String lastName;
        int studentAge;

        Student(int studentId, String firstName, String lastName, int studentAge) {
            this.studentId = studentId; // where this is the current object, studentId is the instance variable
            this.firstName = firstName;
            this.lastName = lastName;
            this.studentAge = studentAge;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];
        int studentCount = 0;


        while (true) {
            System.out.println("1. Enter student details");
            System.out.println("2. Display student details");
            System.out.println("3. Reset student data");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Enter student ID: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();

                    boolean idExists = false;
                    for (int i = 0; i < studentCount; i++) {
                        if (students[i] != null && students[i].studentId == studentId) {
                            idExists = true;
                            break;
                        }
                    }
                    if (idExists) {
                        System.out.println("Student ID already exists. Please enter a unique ID.");
                    } else {
                        System.out.println("Enter student's first name: ");
                        String firstName = scanner.nextLine();

                        System.out.println("Enter student's last name: ");
                        String lastName = scanner.nextLine();

                        System.out.println("Enter student's age: ");
                        int studentAge = scanner.nextInt();

                        Student student = new Student(studentId, firstName, lastName, studentAge);
                        students[studentCount] = student;
                        studentCount++;
                        System.out.println("Student details saved successfully");
                    }


                case 2:
                    boolean hasStudents = false;
                    for (int i = 0; i < studentCount; i++) {
                        if (students[i] != null) {
                            hasStudents = true;
                            System.out.println("+++Student details+++");
                            System.out.println("Student ID: " + students[i].studentId);
                            System.out.println("Student Name: " + students[i].firstName + " " + students[i].lastName);
                            System.out.println("Student Age: " + students[i].studentAge);
                            System.out.println("+++End of Student details+++");
                        }
                    }

                    if (!hasStudents) {
                        System.out.println("No student data found");
                    }
                    break;

                case 3:
                    System.out.println("Enter student ID to reset: ");
                    int id = scanner.nextInt();
                    boolean found = false;
                    for (int i = 0; i < studentCount; i++) {
                        if (students[i] != null && students[i].studentId == id) {
                            students[i] = null;
                            found = true;
                            System.out.println("Student data has been reset");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student ID not found");
                    }
                    break;

                case 4:
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
                    break; // where break is used to exit the switch statement and continue with the next iteration of the loop (if any) or exit the loop (if there are no more iterations)
            }
        }
    }
}