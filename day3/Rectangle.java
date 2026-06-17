package day3;

public class Rectangle {
    public static void main(String[] args) {
        int rows = 6;
        int cols = 15;
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= cols; col++) {
                if(row == 1 || row == rows || col == 1 || col == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        }
}
