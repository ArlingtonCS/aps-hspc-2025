// HINT: the trigonometric functions in Java use radians instead of degrees,
// use the function `Math.toRadians` to convert from degrees to radians

import java.util.Scanner;

class Sample {
    public static boolean does_intersect(
            double first_x, double first_y, double second_x, double second_y, double angle) {
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < count; i++) {
            String[] parts = scan.nextLine().split(" ");

            if (does_intersect(
                    Double.parseDouble(parts[0]),
                    Double.parseDouble(parts[1]),
                    Double.parseDouble(parts[2]),
                    Double.parseDouble(parts[3]),
                    Double.parseDouble(parts[4]))) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
