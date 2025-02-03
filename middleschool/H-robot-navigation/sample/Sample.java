import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sample {

    // Function to calculate the final position
    public static int[] calculateFinalPosition(List<String[]> instructions) {
        int x = 0, y = 0;

        // WRITE CODE HERE

        return new int[] {x, y};
    }

    // DO DO NOT MODIFY BELOW HERE

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
