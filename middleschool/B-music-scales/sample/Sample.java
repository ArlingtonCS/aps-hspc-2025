import java.util.Scanner;

public class Sample {
    public static String getNoteInScale(int position) {

        // WRITE CODE HERE
        String answer = "";

        return cMajorScale;
    }

    // DO NOT MODIFY BELOW HERE
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Parse the input
        int position = scanner.nextInt();

        String note = getNoteInScale(position);
        System.out.println(note);

        scanner.close();
    }
}
