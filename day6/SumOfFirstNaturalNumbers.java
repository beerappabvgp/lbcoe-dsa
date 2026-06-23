package day6;

public class SumOfFirstNaturalNumbers {

    public static int sumOfFirstNNaturalNumbers(int n) {
        if ( n == 1) {
            return 1;
        }

        return n + sumOfFirstNNaturalNumbers(n - 1);
    }
    public static void main(String[] args) {
        
    }
}
