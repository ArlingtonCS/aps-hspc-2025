import java.util.Scanner;

public class ProblemB {
    public static String decrypt(String message) {
        // ### WRITE YOUR CODE HERE ###

        return message;
    }

    // parsing code, DO NOT MODIFY
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int testCases = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            for (int i = 0; i < testCases; i++) {
                String line = scanner.nextLine();
                System.out.println(decrypt(line));
            }
        }
    }
}
