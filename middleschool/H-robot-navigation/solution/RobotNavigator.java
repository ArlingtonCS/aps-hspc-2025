import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RobotNavigator {

    // Function to calculate the final position
    public static int[] calculateFinalPosition(List<String[]> instructions) {
        int x = 0, y = 0;

        for (String[] instruction : instructions) {
            String direction = instruction[0];
            int units = Integer.parseInt(instruction[1]);

            switch (direction) {
                case "UP":
                    y += units;
                    break;
                case "DOWN":
                    y -= units;
                    break;
                case "LEFT":
                    x -= units;
                    break;
                case "RIGHT":
                    x += units;
                    break;
            }
        }

        return new int[]{x, y};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input parsing
        int n = Integer.parseInt(scanner.nextLine());
        List<String[]> instructions = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] instruction = scanner.nextLine().split(" ");
            instructions.add(instruction);
        }

        // Calculate final position
        int[] finalPosition = calculateFinalPosition(instructions);

        // Output the result
        System.out.println(finalPosition[0] + " " + finalPosition[1]);
        
        scanner.close();
    }
}
