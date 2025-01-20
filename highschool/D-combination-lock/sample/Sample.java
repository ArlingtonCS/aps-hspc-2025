import java.util.Scanner;

public class Sample {
    /**
     * Output each combination using System.out.println() n is the number of wheels d is the highest
     * digit on the wheel
     */
    public static void combinationLock(int n, int d) {
        // ### WRITE YOUR CODE HERE ###
    }

    // parsing code, DO NOT MODIFY
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int testCases = scanner.nextInt();

            for (int i = 0; i < testCases; i++) {
                scanner.nextLine(); // consume newline character
                int n = scanner.nextInt();
                int d = scanner.nextInt();

                combinationLock(n, d);
            }
        }
    }
}
