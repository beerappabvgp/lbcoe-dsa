package day3;

public class InvertedRightTriangle {
    public static void main(String[] args) {
        int numberOfRows = 5;
        for (int row = 1; row <= numberOfRows; row++) {
            for (int col = 1; col <= (numberOfRows - row + 1); col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
