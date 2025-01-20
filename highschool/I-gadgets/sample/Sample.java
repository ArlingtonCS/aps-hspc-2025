import java.util.Scanner;

class Sample {
    public static int num_gadget_combos(int pocket_size, int sizes[]) {
        return 0;
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
