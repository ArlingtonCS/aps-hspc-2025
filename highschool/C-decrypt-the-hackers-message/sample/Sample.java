import java.util.Scanner;

public class Sample {
    // Returns the decrypted message
    public static String decrypt(String message) {
        // ### WRITE YOUR CODE HERE ###
        return "";
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
