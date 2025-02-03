import java.util.Scanner;

public class Sample {

    // Function to translate the brainrot word
    public static String brainrotTranslator(String word) {
        // WRITE CODE HERE
        return "";
    }

    // DO NOT MODIFY BELOW HERE

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Parse the input
        int n = Integer.parseInt(scanner.nextLine()); // Number of words
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine().trim();
            System.out.println(brainrotTranslator(word));
        }

        scanner.close();
    }
}
