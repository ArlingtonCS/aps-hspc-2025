import java.util.Scanner;

public class CombinationLock {
    /**
     * Output each combination using System.out.println() n is the number of wheels d is the highest
     * digit on the wheel
     */
    public static void combinationLock(int n, int d) {
        // There are two ways to solve this problem:
        // 1. Generate the permutations using a traditional approach
        // 2. Notice that the output is the same as counting in base (d+1) up to (d+1)^n
        // We will use the second approach!

        for (int i = 0; i < Math.pow(d + 1, n); i++) {
            String combination = Integer.toString(i, d + 1);
            System.out.printf("%0" + n + "d\n", Integer.parseInt(combination));
        }
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
