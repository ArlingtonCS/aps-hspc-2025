import java.util.HashMap;
import java.util.Scanner;

class Datapoint {
    String name;
    int missionsCompleted;

    public Datapoint(String name, int missionsCompleted) {
        this.name = name;
        this.missionsCompleted = missionsCompleted;
    }

    public String getName() {
        return name;
    }

    public int getMissionsCompleted() {
        return missionsCompleted;
    }
}

public class Solution {
    public static void findMole(Datapoint[] datapoints) {
        HashMap<String, Integer> agentsCounts = new HashMap<>();
        HashMap<String, Integer> agentsTotals = new HashMap<>();
        for (Datapoint datapoint : datapoints) {
            agentsCounts.put(
                    datapoint.getName(), agentsCounts.getOrDefault(datapoint.getName(), 0) + 1);
            agentsTotals.put(
                    datapoint.getName(),
                    agentsTotals.getOrDefault(datapoint.getName(), 0)
                            + datapoint.getMissionsCompleted());
        }
        for (String agent : agentsCounts.keySet()) {
            double average = (double) agentsTotals.get(agent) / agentsCounts.get(agent);
            if (average < 4) {
                System.out.println(agent);
                return;
            }
        }
    }

    // parsing code, DO NOT MODIFY
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int testCases = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            for (int i = 0; i < testCases; i++) {
                int n = scanner.nextInt();
                scanner.nextLine(); // consume newline character
                Datapoint[] datapoints = new Datapoint[n];
                for (int j = 0; j < n; j++) {
                    String[] parts = scanner.nextLine().split(",");
                    String agentName = parts[0];
                    int missionsCompleted = Integer.parseInt(parts[1]);
                    datapoints[j] = new Datapoint(agentName, missionsCompleted);
                }

                findMole(datapoints);
            }
        }
    }
}
