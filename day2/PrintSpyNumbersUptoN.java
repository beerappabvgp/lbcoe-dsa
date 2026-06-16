package day2;
import java.util.Scanner;

public class PrintSpyNumbersUptoN {

    public static boolean isSpy(int n) {
        int sum = 0;
        int product = 1;

        while (n > 0) { // - O(no_of_digits)
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return sum == product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number .... ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) { // - O(n)
            if (isSpy(i)) { // - O(no_of_digits)
                System.out.println(i + " ");
            }
        }
    }
}

// OTC = O(n) * O(no_of_digits)
// OSC = O(1)