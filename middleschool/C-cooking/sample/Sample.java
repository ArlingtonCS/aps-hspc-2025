import java.util.*;

public class Sample {

    // Function to convert units to ounces
    public static double convertToOunces(double quantity, String unit) {
        double unit = 0;
        // WRITE CODE HERE
        return unit;
    }

    // DO NOT MODIFY BELOW HERE
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of ingredients
        int n = Integer.parseInt(scanner.nextLine());

        // Parse and process each ingredient
        List<String> results = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            double quantity = Double.parseDouble(input[0]);
            String unit = input[1];

            double ounces = convertToOunces(quantity, unit);
            results.add(String.format("%.2f", ounces));
        }

        // Print the results
        for (String result : results) {
            System.out.println(result);
        }

        scanner.close();
    }
}
