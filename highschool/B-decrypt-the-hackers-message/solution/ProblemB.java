import java.util.Scanner;

public class ProblemB {
    public static String decrypt(String message) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (Character.isLetter(ch)) {
                char rotatedChar = rotate(ch);
                int count = 1;
                while (i + 1 < message.length() && message.charAt(i + 1) == ch) {
                    count++;
                    i++;
                }
                if (count > 1) {
                    result.append(count);
                }
                result.append(rotatedChar);
            } else if (Character.isDigit(ch)) {
                result.append((ch - '0' + 5) % 10);
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    private static char rotate(char ch) {
        return (char) ((ch - 'A' + 13) % 26 + 'A');
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
