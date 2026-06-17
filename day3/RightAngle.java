package day3;

public class RightAngle {
    public static void main(String[] args) {
        int numberOfRows = 8;
        for (int row = 1; row <= numberOfRows; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    } 
}