//take user input with scanner (int n)
//depending on that number draw pyramid with specified number of rows


package Session4;
import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pyramid: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("$");
            }


            System.out.println();
        }
        scanner.close();
    }
}
