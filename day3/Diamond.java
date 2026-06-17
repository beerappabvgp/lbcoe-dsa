package day3;

//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *


public class Diamond {
    public static void main(String[] args) {
        int numberOfRows = 5;

        // top pyramid

        for (int row = 1; row <= numberOfRows; row++) { 
            // spaces
            for(int space = 1; space <= numberOfRows - row; space++) {
                System.out.print(" ");
            }

            // stars
            for(int star = 1; star <= 2*row - 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Bottom Pyramid 

        for(int row = 2; row <= numberOfRows; row++) {
            // space 
            for (int space = 1; space <= row - 1; space++) {
                System.out.print(" ");
            }

            // stars
            for(int star = 1; star <= 2 * (numberOfRows - row) + 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
