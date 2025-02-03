import java.util.*;

public class Sample {

    public static int minimumPhotosToDelete(int number_of_photos, int total_memory, int[] sizes) {
        // WRITE CODE HERE

        return 0;
    }

    // DO NOT MODIFY BELOW THIS LINE

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input reading
        int number_of_photos = scanner.nextInt();
        int total_memory = scanner.nextInt();
        int[] sizes = new int[number_of_photos];

        for (int i = 0; i < number_of_photos; i++) {
            sizes[i] = scanner.nextInt();
        }

        // Output the result
        System.out.println(minimumPhotosToDelete(number_of_photos, total_memory, sizes));

        scanner.close();
    }
}
