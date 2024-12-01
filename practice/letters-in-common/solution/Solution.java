import java.util.HashSet;
import java.util.Scanner;

class Sample {
    public static HashSet<Character> string_to_set(String input) {
        HashSet<Character> letters = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            letters.add(input.charAt(i));
        }
        return letters;
    }

    public static int num_letters_in_common(String input[]) {
        HashSet<Character> letters = string_to_set(input[0]);
        for (int i = 1; i < input.length; i++) {
            letters.retainAll(string_to_set(input[i]));
        }
        return letters.size();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num_cases = Integer.parseInt(scan.nextLine());
        for (int t = 0; t < num_cases; t++) {
            System.out.println(num_letters_in_common(scan.nextLine().split(" ")));
        }
    }

}
