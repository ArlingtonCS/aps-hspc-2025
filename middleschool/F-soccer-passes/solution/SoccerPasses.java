import java.util.Scanner;

public class SoccerPasses {

    // Function to calculate the distance between two points
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Parse the input for Player A's coordinates
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        // Parse the input for Player B's coordinates
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        // Calculate the distance
        double distance = calculateDistance(x1, y1, x2, y2);

        // Print the result rounded to two decimal places
        System.out.printf("%.2f%n", distance);

        scanner.close();
    }
}
