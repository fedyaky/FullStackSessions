package Session4;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        scanner.close();
    }
}
