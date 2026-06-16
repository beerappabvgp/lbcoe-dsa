package day2;

import java.util.HashSet;

public class HappyNumber {

    public static int sumOfSquaresOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1) {
            if (seen.contains(n)) {
                return false;
            }
            seen.add(n);
            n = sumOfSquaresOfDigits(n);
        }

        return true;
    }
    public static void main(String[] args) {
        int n = 199;
        if (isHappy(n)) {
            System.out.println("Happy Number ....");
        } else {
            System.out.println("Not Happy Number....");
        }
    }
}
