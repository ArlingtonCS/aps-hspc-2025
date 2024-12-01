import java.util.Scanner;

class Sample {
    public static int num_letters_in_common(String input[]) {
        return 0; 
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num_cases = Integer.parseInt(scan.nextLine());
        for (int t = 0; t < num_cases; t++) {
            System.out.println(num_letters_in_common(scan.nextLine().split(" ")));
        }
    }

}
