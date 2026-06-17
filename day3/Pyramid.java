package day3;

public class Pyramid {
    public static void main(String[] args) {
        int numberOfRows = 15;
        for (int row = 1; row <= numberOfRows; row++) {
            // spaces 
            for (int space = 1; space <= (numberOfRows - row); space++) {
                System.out.print(" ");
            }

            // stars
            for(int star = 1; star <= ((2 * row) - 1); star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
