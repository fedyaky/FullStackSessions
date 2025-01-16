package Session5;
import java.util.Scanner;

public class ScannerArray {
    public static void main(String[] args) {

        int[] array = {24, 54, 67, 54, 32, 33, 47, 39};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to search for: ");
        int searchValue = scanner.nextInt();

        boolean found = false;
        for (int num : array) {
            if (num == searchValue) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Value " + searchValue + " found in the array.");
        } else {
            System.out.println("Value " + searchValue + " not found in the array.");
        }

        scanner.close();
    }
}
