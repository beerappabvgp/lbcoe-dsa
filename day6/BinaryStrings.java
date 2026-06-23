package day6;

import java.util.ArrayList;
import java.util.List;

public class BinaryStrings {

    static List<String> result = new ArrayList<>();

    public static void generate(char[] current, int position, int n) {
        if (position == n) {
            result.add(new String(current));
            return;
        }

        // add 0
        current[position] = '0';
        generate(current, position + 1, n);

        // add 1
        current[position] = '1';
        generate(current, position + 1, n);
    }
    public static void main(String[] args) {
        int n = 25;
        char[] current = new char[n];
        generate(current, 0, n);
        System.out.println("All binary strings of length " + n + ":");
        for (String s: result) {
            System.out.println(s);
        }
    }
}
