import java.util.Scanner;

class LaserBeam {
    public static boolean does_intersect(
            double first_x, double first_y, double second_x, double second_y, double angle) {
        double mirror_slope = (first_y - second_y) / (first_x - second_x);
        double laser_slope = Math.tan(Math.toRadians(angle));

        double intersection_x = (mirror_slope * first_x - first_y) / (mirror_slope - laser_slope);

        boolean laser_is_valid =
                ((angle > 270 || angle < 90) && intersection_x >= 0) || intersection_x <= 0;
        boolean mirror_is_valid =
                intersection_x >= Math.min(first_x, second_x)
                        && intersection_x <= Math.max(first_x, second_x);

        return laser_is_valid && mirror_is_valid;
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
