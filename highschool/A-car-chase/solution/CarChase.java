import java.util.Scanner;

public class CarChase {

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

    private static int calculateChaseTime(int xAgent, int yAgent, int xYou, int yYou) {
        int minutes = 0;

        while (true) {
            // Check if the spy has been caught
            if (xAgent == xYou && yAgent == yYou) {
                return minutes;
            }

            // Spy moves away from you
            if (Math.abs(xYou - xAgent) >= Math.abs(yYou - yAgent)) {
                xAgent++;
            } else {
                yAgent++;
            }

            // Your movement (up to 2 Manhattan distance per minute)
            int deltaX = Math.abs(xAgent - xYou);
            int deltaY = Math.abs(yAgent - yYou);

            int moveX = Math.min(deltaX, 2); // Maximum movement in x-direction
            int moveY = Math.min(2 - moveX, deltaY); // Remaining movement in y-direction

            if (xYou < xAgent) {
                xYou += moveX;
            } else if (xYou > xAgent) {
                xYou -= moveX;
            }

            if (yYou < yAgent) {
                yYou += moveY;
            } else if (yYou > yAgent) {
                yYou -= moveY;
            }

            // Increment the time counter
            minutes++;
        }
    }
}
