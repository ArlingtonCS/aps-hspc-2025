import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static int num_gadget_combos(int pocket_size, int sizes[]) {
        Arrays.sort(sizes);
        return num_gadget_combos_already_sorted(pocket_size, sizes);
    }

    public static int num_gadget_combos_already_sorted(int pocket_size, int sizes[]) {
        if (pocket_size == 0) {
            return 1;
        } else if (sizes.length == 0) {
            return 0;
        }

        int sum = 0;
        int newSizes[] = Arrays.copyOfRange(sizes, 1, sizes.length);
        for (int size_used = 0; size_used <= pocket_size; size_used += sizes[0]) { 
            sum += num_gadget_combos_already_sorted(pocket_size - size_used, newSizes);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num_cases = Integer.parseInt(scan.nextLine());
        for (int t = 0; t < num_cases; t++) {
            int pocket_size = Integer.parseInt(scan.nextLine());
            int count = Integer.parseInt(scan.nextLine());
            int sizes[] = new int[count];

            for (int i = 0; i < count; i++) {
                sizes[i] = Integer.parseInt(scan.nextLine());
            }

            System.out.println(num_gadget_combos(pocket_size, sizes));
        }
    }

}
