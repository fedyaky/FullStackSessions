package Session4;

// The do-while loop is similar to the while loop, except that the condition is checked at the end of the loop.
// This means that the loop will always run at least once.
// The syntax of the do-while loop is as follows:
// do {
//     // code block to be executed
// } while (condition);
// The do-while loop is useful when you want to execute a block of code at least once, regardless of the condition.
// The do-while loop is less commonly used than the while loop, but it can be useful in certain situations.
// In this example, we use a do-while loop to print a message for each iteration of the loop.
// The loop will run at least once, even though the condition is false.
// The output of the program will be:
// This is iteration 1

public class DoWhileSample {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("This is iteration " + i);
            i++;
        } while (i < 1);
    }
}
