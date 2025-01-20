import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Solution {
    public static record QueueItem(int portal, int cost) {}
    ;

    public static void navigate(Portal portals[]) {
        ArrayDeque<QueueItem> queue = new ArrayDeque<>();
        queue.add(new QueueItem(0, 0));
        HashSet<Integer> seen = new HashSet<>();

        HashMap<Integer, ArrayList<Integer>> processed_portals = new HashMap<>();

        for (Portal portal : portals) {
            if (!processed_portals.containsKey(portal.first_room)) {
                processed_portals.put(portal.first_room, new ArrayList<>());
            }
            if (!processed_portals.containsKey(portal.second_room)) {
                processed_portals.put(portal.second_room, new ArrayList<>());
            }

            processed_portals.get(portal.first_room).add(portal.second_room);
            processed_portals.get(portal.second_room).add(portal.first_room);
        }

        while (true) {
            QueueItem item = queue.pop();

            if (item.portal == 1000) {
                System.out.println(item.cost);
                return;
            }

            for (int room : processed_portals.get(item.portal)) {
                if (!seen.contains(room)) {
                    queue.add(new QueueItem(room, item.cost + 1));
                    seen.add(room);
                }
            }
        }
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
