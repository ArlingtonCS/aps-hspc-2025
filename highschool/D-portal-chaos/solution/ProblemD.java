import java.util.ArrayList;
import java.util.Scanner;

public class ProblemD {
    public static int navigate(Portal portals[], ArrayList<Integer> seen_rooms, int current_room) {
        for (Portal portal : portals) {
            int first_room = portal.first_room();
            int second_room = portal.second_room();

            if (first_room != current_room && second_room != current_room) {
                continue;
            } else if ((first_room == current_room && second_room == 1000) || (second_room == current_room && first_room == 1000)) {
                return 1;
            } else if (first_room == current_room && !seen_rooms.contains(second_room)) {
                seen_rooms.add(second_room);
                int count = navigate(portals, seen_rooms, second_room);
                if (count != -1) {
                    return count + 1;
                }
            }

            else if (second_room == current_room && !seen_rooms.contains(first_room)) {
                seen_rooms.add(first_room);
                int count = navigate(portals, seen_rooms, first_room);
                if (count != -1) {
                    return count + 1;
                }
            }
        }

        return -1;
    }

    public static int navigate(Portal portals[]) {
        ArrayList<Integer> seen_rooms = new ArrayList<>();
        seen_rooms.add(0);

        return navigate(portals, seen_rooms, 0);
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

        System.out.println(navigate(portals));

        scanner.close();
    }

    public static record Portal(int first_room, int second_room) {};
}
