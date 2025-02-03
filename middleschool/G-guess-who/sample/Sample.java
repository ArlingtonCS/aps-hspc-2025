import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sample {
    public static List<String> findMysteryGuest(List<String[]> guests, String[] clues) {
        List<String> matchingGuests = new ArrayList<>();

        // WRITE CODE HERE

        return matchingGuests;
    }

    // DO NOT MODIFY BELOW THIS POINT
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input parsing
        int testCases = Integer.parseInt(scanner.nextLine().trim());
        List<String> results = new ArrayList<>();

        for (int t = 0; t < testCases; t++) {
            int numberOfGuests = Integer.parseInt(scanner.nextLine().trim());
            List<String[]> guests = new ArrayList<>();

            for (int i = 0; i < numberOfGuests; i++) {
                guests.add(scanner.nextLine().trim().split(" "));
            }

            String[] clues = scanner.nextLine().trim().split(" ");
            List<String> matchingGuests = findMysteryGuest(guests, clues);

            if (matchingGuests.isEmpty()) {
                results.add("No match found.");
            } else {
                results.add(String.join(" ", matchingGuests));
            }
        }

        // Output results
        for (String result : results) {
            System.out.println(result);
        }

        scanner.close();
    }
}
