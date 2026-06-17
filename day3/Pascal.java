package day3;

public class Pascal {
    public static void main(String[] args) {
        int numberOfRows = 6;
        int[] previous = new int[0];

        for (int row = 0; row < numberOfRows; row++) {
            int[] current = new int[row + 1];
            current[0] = 1;
            current[row] = 1;

            // fill the middle elements 
            for (int col = 1; col < row; col++) {
                current[col] = previous[col - 1] + previous[col];
            }

            // spaces 
            for(int space = 0; space < numberOfRows - row - 1; space++) {
                System.out.print("  ");
            } 

            // print the number 
            for (int num : current) {
                System.out.printf("%4d", num);
            }
            System.out.println();
            previous = current;
        }
    }
}
