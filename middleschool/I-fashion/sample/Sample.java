import java.util.Scanner;

public class Sample {

    // Function to generate all outfit combinations
    public static void generateOutfits(String[] shirts, String[] pants, String[] shoes) {
        // WRITE CODE HERE

        // ADD PRINT STATEMENTS

    }

    // DO NOT MODIFY BELOW HERE
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Parse input for shirts
        int numShirts = Integer.parseInt(scanner.nextLine());
        String[] shirts = scanner.nextLine().split(" ");

        // Parse input for pants
        int numPants = Integer.parseInt(scanner.nextLine());
        String[] pants = scanner.nextLine().split(" ");

        // Parse input for shoes
        int numShoes = Integer.parseInt(scanner.nextLine());
        String[] shoes = scanner.nextLine().split(" ");

        // Call the function
        generateOutfits(shirts, pants, shoes);

        scanner.close();
    }
}
