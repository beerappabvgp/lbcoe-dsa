package day2;

public class MagicNumber {

    public static boolean isMagic(int n) {
        while (n > 9) {
            int sum = 0;

            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }

            n = sum;
        }
        return n == 1;
    }
    public static void main(String[] args) {
        int n = 19; 
        if (isMagic(n)) {
            System.out.println("Magic Number .... ");
        } else {
            System.out.println("Not a magic Number .... ");
        }
    }
}
