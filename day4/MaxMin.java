package day4;

import java.util.ArrayList;

public class MaxMin {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(35);
        nums.add(-100);
        nums.add(7);
        nums.add(8);

        int size = nums.size();
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        for (int idx = 0; idx < size; idx++) {
            if (nums.get(idx) > maximum) {
                maximum = nums.get(idx);
            }
            if (nums.get(idx) < minimum) {
                minimum = nums.get(idx);
            }
        }

        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
    }
}


// TC = O(size of array)
// SC = O(1)