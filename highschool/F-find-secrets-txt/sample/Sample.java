import java.util.Scanner;

public class Sample {
    // Returns the path to secrets.txt
    public static String findSecretsTxt(String[] lines) {
        // ### WRITE YOUR CODE HERE ###
    }

    // parsing code, DO NOT MODIFY
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int lineCount = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            String[] lines = new String[lineCount];
            for (int i = 0; i < lineCount; i++) {
                lines[i] = scanner.nextLine();
            }
            System.out.println(findSecretsTxt(lines));
        }
    }
}
