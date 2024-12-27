
// use a do-while loop to repeatedly ask for user input until the user enters a negative number.
// print confirmation in case positive number provided
// if user enter a negative number, prompt again to enter a positive number

// use a do-while loop to repeatedly ask for user input
//if user enter a negative number, prompt again
//print confirmation in case positive number provided

package Session4;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();
            if (number >= 0) {
                System.out.println("You entered: " + number);
            } else if (number == -10) {
                break;
            } else {
                System.out.println("Please enter a positive number.");
            }
        } while (number < 0);
        scanner.close();
    }
}