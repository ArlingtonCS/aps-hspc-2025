import java.util.Scanner;

public class Sample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of test cases
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int t = 0; t < T; t++) {
            // Read spy's starting position
            String[] agentCoords = scanner.nextLine().split(",");
            int xAgent = Integer.parseInt(agentCoords[0]);
            int yAgent = Integer.parseInt(agentCoords[1]);

            // Read your starting position
            String[] youCoords = scanner.nextLine().split(",");
            int xYou = Integer.parseInt(youCoords[0]);
            int yYou = Integer.parseInt(youCoords[1]);

            System.out.println(calculateChaseTime(xAgent, yAgent, xYou, yYou));
        }

        scanner.close();
    }

    // DO NOT MODIFY ABOVE HERE

    private static int calculateChaseTime(int xAgent, int yAgent, int xYou, int yYou) {
        // WRITE CODE HERE
    }
}
