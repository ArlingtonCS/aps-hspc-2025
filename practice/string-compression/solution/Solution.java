import java.util.Scanner;

class Sample {
    public static String compress(String input) {
        String output = "";
        char current_char = input.charAt(0);
        int current_count = 1;

        for (int i = 1; i < input.length(); i++) {
            char character = input.charAt(i);
            if (character == current_char) {
                current_count++;
                continue;
            }

            if (current_count != 1) {
                output += String.format("(%c)%d", current_char, current_count);
            } else {
                output += current_char;
            }

            current_count = 1;
            current_char = character;
        }

        if (current_count != 1) {
            output += String.format("(%c)%d", current_char, current_count);
        } else {
            output += current_char;
        }

        return output;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num_cases = Integer.parseInt(scan.nextLine());
        for (int t = 0; t < num_cases; t++) {
            System.out.println(compress(scan.nextLine()));
        }
    }

}
