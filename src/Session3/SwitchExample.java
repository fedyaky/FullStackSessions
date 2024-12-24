package Session3;

public class SwitchExample {
    public static void main(String[] args) {
        int numberToString = 3;

        switch (numberToString) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Invalid number");
        }

        String wordToNumber = "sdfszdfc";
        switch (wordToNumber) {
            case "One":
                System.out.println(1);
                break;
            case "Two":
                System.out.println(2);
                break;
            case "Three":
                System.out.println(3);
                break;
            default:
                System.out.println("Invalid word");
        }

    }
}
