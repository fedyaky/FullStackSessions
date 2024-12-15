package Session2;

// Import the Scanner class
import java.util.Scanner;

public class ScannerSample {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your height: ");
        double height = scanner.nextDouble();

        // Output the user input
        System.out.println("My name is: " + name + ", I am " + age + " years old, and I'm " + height + " feet tall.");

        // Close the scanner
        scanner.close();
    }
}
