package day1;

public class OppositeSigns {

    public static boolean oppositeSigns(int num1, int num2) {
        return (num1 ^ num2) < 0;
    }
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 78; 
        System.err.println(oppositeSigns(num1, num2));
    }
}
