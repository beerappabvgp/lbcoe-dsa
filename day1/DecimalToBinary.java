package day1;

public class DecimalToBinary {

    public static String decimalToBinary(int n) {
        if ( n == 0) {
            return "0";
        }
 
        StringBuilder binary = new StringBuilder();

        while (n > 0) {
            int remainder = n % 2;
            binary.append(remainder);
            n = n / 2;
        }

        return binary.reverse().toString();
    }
    
    public static String decimalToBinaryBitManipulation(int n){
        if (n == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            int last_bit = n & 1;
            binary.append(last_bit);
            n = n >> 1;
        }

        return binary.reverse().toString();
    }
    
    public static void main(String[] args) {
        int n = 500000000;
        System.out.println(decimalToBinaryBitManipulation(n));
    }
}
