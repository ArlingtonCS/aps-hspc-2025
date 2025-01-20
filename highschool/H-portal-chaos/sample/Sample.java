import java.util.Scanner;

public class Sample {
    public static void navigate(Portal portals[]) {
        // ### WRITE YOUR CODE HERE ###
    }

    // parsing code, DO NOT MODIFY
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num_rooms = scanner.nextInt();
        scanner.nextLine();

        Portal portals[] = new Portal[num_rooms];

        for (int i = 0; i < num_rooms; i++) {
            String line = scanner.nextLine();
            int split_idx = line.indexOf(',');

            int first_room = Integer.parseInt(line.substring(0, split_idx));
            int second_room = Integer.parseInt(line.substring(split_idx + 1));

            portals[i] = new Portal(first_room, second_room);
        }

        navigate(portals);

        scanner.close();
    }

    public static record Portal(int first_room, int second_room) {}
    ;
}
