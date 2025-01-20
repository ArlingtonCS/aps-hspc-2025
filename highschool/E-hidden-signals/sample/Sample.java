import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sample {

    public static String processCommands(List<Character> message, List<String> commands) {
        // Your code here
        return null; // Replace with the final result
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = Integer.parseInt(scanner.nextLine().trim());

        List<String> results = new ArrayList<>();

        // Loop over each test case
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(scanner.nextLine().trim()); // Read the number of commands
            String encodedMessage = scanner.nextLine().trim(); // Read the encoded message
            List<Character> message = new ArrayList<>();
            for (char c : encodedMessage.toCharArray()) {
                message.add(c);
            }

            // Read commands for the current test case
            List<String> commands = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                commands.add(scanner.nextLine().trim());
            }

            // Process commands and store the result
            String decryptedMessage = processCommands(message, commands);
            results.add(decryptedMessage);
        }

        scanner.close();

        // Output all results
        for (String result : results) {
            System.out.println(result);
        }
    }
}
