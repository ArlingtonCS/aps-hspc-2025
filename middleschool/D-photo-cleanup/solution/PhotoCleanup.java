import java.util.*;

public class PhotoCleanup {

    public static int minimumPhotosToDelete(int number_of_photos, int total_memory, int[] sizes) {
        // Calculate the total size of all photos
        int total_size = 0;
        for (int size : sizes) {
            total_size += size;
        }
        
        // If the total size is already within the limit, no photos need to be deleted
        if (total_size <= total_memory) {
            return 0;
        }
        
        // Sort the photo sizes in descending order (largest to smallest)
        Arrays.sort(sizes);
        // Reverse the array for descending order
        for (int i = 0; i < sizes.length / 2; i++) {
            int temp = sizes[i];
            sizes[i] = sizes[sizes.length - i - 1];
            sizes[sizes.length - i - 1] = temp;
        }
        
        // Initialize variables to track the size freed and number of photos deleted
        int size_freed = 0;
        int photos_deleted = 0;
        
        // Delete photos until the total size is within the limit
        for (int size : sizes) {
            size_freed += size;
            photos_deleted++;
            if (total_size - size_freed <= total_memory) {
                break;
            }
        }
        
        return photos_deleted;
    }

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
