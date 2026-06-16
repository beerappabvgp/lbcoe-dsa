package day2;

import java.util.HashSet;

public class HappyNumber {

    // O(no_of_digits)
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
        
        // 0(1) * O(no_of_digits)
        while (n != 1) {
            if (seen.contains(n)) {
                System.out.println("length of set: " + seen.size());
                return false;
            }
            seen.add(n);
            n = sumOfSquaresOfDigits(n);
        }

        return true;
    }
    public static void main(String[] args) {
        int n = 1999876995;
        if (isHappy(n)) {
            System.out.println("Happy Number ....");
        } else {
            System.out.println("Not Happy Number....");
        }
    }
}

// OTC: O(1) * O(no_of_digits) = O(no_of_digits)
// OSC: O(number of elements in the set)