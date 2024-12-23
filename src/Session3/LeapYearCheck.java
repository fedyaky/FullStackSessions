package Session3;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        System.out.println("Enter a year to check if it is a leap year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();
        if (year % 4 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

//
//        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//            System.out.println(year + " is a leap year");
//        } else {
//            System.out.println(year + " is not a leap year");
//        }
//
//
//
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    System.out.println(year + " is a leap year");
//                } else {
//                    System.out.println(year + " is not a leap year");
//                }
//            } else {
//                System.out.println(year + " is a leap year");
//            }
//        } else {
//            System.out.println(year + " is not a leap year");
//        scanner.close();
//        }
//

    }


}
