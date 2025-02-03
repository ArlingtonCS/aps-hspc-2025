import java.util.Scanner;

public class BrainrotTranslator {

    // Function to translate the brainrot word
    public static String brainrotTranslator(String word) {
        if (word.equals("skibidi")) {
            return "toilet";
        }
        if (word.equals("fanum")) {
            return "tax";
        }
        if (word.equals("sigma")) {
            return "male";
        }
        return ""; // Default empty string if word doesn't match
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Parse the input
        int n = Integer.parseInt(scanner.nextLine()); // Number of words
        String[] results = new String[n];
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine().trim();
            results[i] = brainrotTranslator(word);
        }

        // Print the results line by line
        for (String result : results) {
            System.out.println(result);
        }

        scanner.close();
    }
}