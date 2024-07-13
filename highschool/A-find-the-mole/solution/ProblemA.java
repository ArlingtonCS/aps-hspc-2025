import java.util.HashMap;
import java.util.Scanner;

public class ProblemA {
    public static String findMole(String[] datapoints) {
        HashMap<String, Integer> agentsCounts = new HashMap<>();
        HashMap<String, Integer> agentsTotals = new HashMap<>();
        for (String datapoint : datapoints) {
            String[] parts = datapoint.split(",");
            String agent = parts[0];
            int missions = Integer.parseInt(parts[1]);

            agentsCounts.put(agent, agentsCounts.getOrDefault(agent, 0) + 1);
            agentsTotals.put(agent, agentsTotals.getOrDefault(agent, 0) + missions);
        }
        for (String agent : agentsCounts.keySet()) {
            double average = (double) agentsTotals.get(agent) / agentsCounts.get(agent);
            if (average < 4) {
                return agent;
            }
        }
        return "No mole found";
    }

    // parsing code, DO NOT MODIFY
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int testCases = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            for (int i = 0; i < testCases; i++) {
                int n = scanner.nextInt();
                scanner.nextLine(); // consume newline character
                String[] datapoints = new String[n];
                for (int j = 0; j < n; j++) {
                    datapoints[j] = scanner.nextLine();
                }

                System.out.println(findMole(datapoints));
            }
        }
    }
}
