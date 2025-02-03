import java.util.Scanner;

public class MusicScales {
    public static String getNoteInScale(int position) {
        String[] cMajorScale = {"C", "D", "E", "F", "G", "A", "B", "C"};
        // Adjust for zero-based indexing
        return cMajorScale[position - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Parse the input
        int position = scanner.nextInt();

        String note = getNoteInScale(position);
        System.out.println(note);
        

        scanner.close();
    }
}
