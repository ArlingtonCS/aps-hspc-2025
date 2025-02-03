import java.util.Scanner;

public class FashionCombinations {
    
    // Function to generate all outfit combinations
    public static void generateOutfits(String[] shirts, String[] pants, String[] shoes) {
        for (String shirt : shirts) {
            for (String pant : pants) {
                for (String shoe : shoes) {
                    System.out.println(shirt + " - " + pant + " - " + shoe);
                }
            }
        }
    }

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