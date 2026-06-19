package day4;

import java.util.ArrayList;

public class IsSorted {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(20);
        nums.add(3);

        boolean isSorted = true;
        int size = nums.size();

        for (int idx = 0; idx < size - 1; idx++) {
            if (nums.get(idx) > nums.get(idx + 1)) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("sorted .... ");
        } else {
            System.out.println("Not sorted .....");
        }

    }
}
