import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Sample {

    public static Map<String, Integer> countOceanZones(int[] depths) {
        // Use LinkedHashMap to maintain the order of the zones
        Map<String, Integer> zoneCounts = new LinkedHashMap<>();
        zoneCounts.put("Sunlight Zone", 0);
        zoneCounts.put("Twilight Zone", 0);
        zoneCounts.put("Midnight Zone", 0);
        zoneCounts.put("Abyssal Zone", 0);
        zoneCounts.put("Trenches", 0);

        // WRITE CODE HERE

        return zoneCounts;
    }

    // DO NOT MODIFY BELOW THIS LINE
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of depths
        int numCases = Integer.parseInt(scanner.nextLine());
        int[] depths = new int[numCases];

        // Read the depths
        for (int i = 0; i < numCases; i++) {
            depths[i] = Integer.parseInt(scanner.nextLine());
        }

        // Get the zone counts
        Map<String, Integer> zoneCounts = countOceanZones(depths);

        // Print the results in the required order
        for (Map.Entry<String, Integer> entry : zoneCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
