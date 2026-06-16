package day2;

public class StrongNumber {
    static int[] fact = new int[10];

    static void precomputeFactorials() {
        fact[0] = 1;
        for (int i = 1; i <= 9; i++) {
            fact[i] = fact[i-1] * i;
        }
    }

    public static boolean isStrong(int num) {
        int original = num;
        int sum = 0;

        if (num == 0) {
            return false;
        }

        while (num > 0) {
            int digit = num % 10;
            sum += fact[digit];
            num /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        int n = 145;
        precomputeFactorials();
        if(isStrong(n)) {
            System.out.println("strong number ...");
        } else {
            System.out.println("Not Strong .... ");
        }
    }
}


// OTC: O(no_of_digits)
// OSC: O(9) => O(1)