import java.util.Scanner;

class Sample {
    public static String compress(String input) {
        return ""; 
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num_cases = Integer.parseInt(scan.nextLine());
        for (int t = 0; t < num_cases; t++) {
            System.out.println(compress(scan.nextLine()));
        }
    }

}
