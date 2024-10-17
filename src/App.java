/*
 * Yuepeng Xiong 
 * 10/17/24
 * Generates the fibonacchi sequence up until the specified users desired number. Stops at 92.
 */


public class App {
    //checks if the value passed in is a number.
    public static boolean isNumeric(String passedValue) {
        try {
            Integer.parseInt(passedValue);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        // Check if user passed in a value or too many values
        if (args.length != 1) {
            System.out.println("You must only pass in one integer number.");
        } else if (!isNumeric(args[0])) { // If the passed value is not a numeric value
            System.out.println("The passed argument is not a number.");
        } else { // If all is fine, compute the Fibonacci sequence
            int maxIterations = Integer.parseInt(args[0]);
            long store = 0;
            long valueBefore = 1; // We start at n = 2, value expected is 1
            long valueBeforeBefore = 0; // Since we started at n=2, the value of n-2 is 0.

            System.out.println("Computing Fibonacci sequence up to: " + maxIterations + " iterations.");

            if (maxIterations == 0) {
                System.out.println("Fibonacci Sequence of 0 iterations is: 0");
            } else if (maxIterations == 1) {
                System.out.println("Fibonacci Sequence of 1 iterations is: 1");
            } else {
                // Only way around because the Fibonacci sequence only works after 2
                System.out.println("F0: 0");
                System.out.println("F1: 1");
                
                // Start at 1 because it makes it easier to understand. F(n) = f(n-1) + f(n-2); parentheses is subscript. This is only valid when i > 2
                for (int i = 2; i <= maxIterations; i++) {
                    if (i > 92) {
                        System.out.println("The next value of the sequence will OVERFLOW the long value. Ending Loop.");
                        break;
                    }
                    store = valueBefore + valueBeforeBefore;
                    System.out.println("F" + i + ": " + store);
                    valueBeforeBefore = valueBefore;
                    valueBefore = store;
                }

                // For when maxIterations is more than 92. Else print it normally
                if (maxIterations > 92) {
                    System.out.println("Fibonacci Sequence of " + 92 + " iterations is: " + store + ". Stopped at 92 iterations instead of " + maxIterations + ".");
                } else {
                    System.out.println("Fibonacci Sequence of " + maxIterations + " iterations is: " + store);
                }
            }
        }
    }
}
