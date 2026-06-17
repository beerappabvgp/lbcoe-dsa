package day3;

public class Spiral {
    public static void main(String[] args) {
        int numberOfRows = 5;
        int[][] arr = new int[numberOfRows][numberOfRows];
        int top = 0;
        int bottom = numberOfRows - 1;

        int left = 0;
        int right = numberOfRows - 1;
        int num = 1;

        while (top <= bottom && left <= right) {
            // Top row
            for (int col = left; col <= right; col++) {
                arr[top][col] = num++;
            }

            top++;

            // right column
            for(int row = top; row <= bottom; row++) {
                arr[row][right] = num++;
            }
            right--;

            // bottom row
            if (top <= bottom) {
                for(int col = right; col >= left; col--) {
                    arr[bottom][col] = num++;
                }
            }
            bottom--;

            // left column
            if (left <= right) {
                for(int row = bottom; row >= top; row--) {
                    arr[row][left] = num++;
                }
            }
            left++;
        }

        for(int r = 0; r < numberOfRows; r++) {
            for(int c = 0; c < numberOfRows; c++) {
                System.out.printf("%4d", arr[r][c]);
            }
            System.out.println();
        }
    }

};
