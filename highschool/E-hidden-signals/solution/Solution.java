import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void processCommands(List<Character> message, List<String> commands) {
        for (String command : commands) {
            String[] parts = command.split(" ");

            // Process replace command
            if (parts[0].equals("replace")) {
                char oldChar = parts[1].charAt(0);
                char newChar = parts[3].charAt(0);
                for (int i = 0; i < message.size(); i++) {
                    if (message.get(i) == oldChar) {
                        message.set(i, newChar);
                    }
                }

                // Process delete command
            } else if (parts[0].equals("delete")) {
                char charToDelete = parts[1].charAt(0);
                message.removeIf(c -> c == charToDelete);

                // Process insert command
            } else if (parts[0].equals("insert")) {
                char charToInsert = parts[1].charAt(0);
                int position = Integer.parseInt(parts[3]) - 1; // Convert 1-based index to 0-based
                message.add(position, charToInsert);
            }
        }

        // Convert List<Character> back to a String
        StringBuilder result = new StringBuilder();
        for (char c : message) {
            result.append(c);
        }
        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = Integer.parseInt(scanner.nextLine().trim());

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

            processCommands(message, commands);
        }

        scanner.close();
    }
}
