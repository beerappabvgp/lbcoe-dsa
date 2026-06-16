package day1;

public class AddOne {

    public static int addOne(int n) {
        int mask = 1;
        while ((n & mask) != 0) {
            n = n ^ mask;
            mask <<= 1;
        }
        n = n ^ mask;
        return n;
    }
    public static void main(String[] args) {
        
    }
}

// 0 => 1
// 1 => 0

// 0011
// 0001

// 0010
// 0001


// 1 and 1 => 0
// 0 and 1 => 1

// 01
// 01
// 0

// 00
// 01
// 1


// 01111
// 00001