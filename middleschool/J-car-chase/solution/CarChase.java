import java.util.Scanner;

public class CarChase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of test cases
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int t = 0; t < T; t++) {
            // Read spy's starting position
            String[] criminaalCoords = scanner.nextLine().split(",");
            int xCriminal = Integer.parseInt(criminaalCoords[0]);
            int yCriminal = Integer.parseInt(criminaalCoords[1]);

            // Read your starting position
            String[] youCoords = scanner.nextLine().split(",");
            int xYou = Integer.parseInt(youCoords[0]);
            int yYou = Integer.parseInt(youCoords[1]);

            System.out.println(calculateChaseTime(xCriminal, yCriminal, xYou, yYou));
        }

        scanner.close();
    }

    private static int calculateChaseTime(int xCriminal, int yCriminal, int xYou, int yYou) {
        return xCriminal - xYou + yCriminal - yYou;
    }
}
