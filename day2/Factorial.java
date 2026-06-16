package day2;

public class Factorial {
    public static void main(String[] args) {
        long n = 99999;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
