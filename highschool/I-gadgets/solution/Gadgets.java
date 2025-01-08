import java.util.Scanner;

class Gadgets {
    public static int num_gadget_combos(int pocket_size, int sizes[]) {
        int counts[] = new int[pocket_size + 1];
        counts[0] = 1;

        for (int size : sizes) {
            for (int count_idx = size; count_idx < pocket_size + 1; count_idx++) {
                counts[count_idx] += counts[count_idx - size];
            }
        }

        return counts[pocket_size];
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
