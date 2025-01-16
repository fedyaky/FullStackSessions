package Session5;

public class ReverseArray {
    public static void main(String[] args) {
        int [] numbers = {10,20,30,40,50};

        System.out.println("Original array:");
        for (int number : numbers) { //where number is the local variable, : is the enhanced for loop operator and numbers is the array object of type int
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Reversed array");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int reversed[] = new int[numbers.length]; //where reversed is the local variable and numbers.length is the instance variable of numbers array object of type int
        for (int i = 0; i < numbers.length; i++) { //
            reversed[i] = numbers[numbers.length - 1 - i];
        }
        for (int j : reversed) { // where : is the enhanced for loop operator and j is the local variable of type int and reversed is the array object of type int
            System.out.print(j + " ");
        }

//        System.out.println("Original array: ");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//
//        System.out.println("Reversed array: ");
//        for (int i = numbers.length - 1; i >= 0; i--) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();

    }
}
