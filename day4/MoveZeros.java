package day4;

import java.util.ArrayList;

public class MoveZeros {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(0);
        nums.add(1);
        nums.add(2);
        nums.add(0);
        nums.add(4);

        int writer = 0;

        for (int reader = 0; reader < nums.size(); reader++) {
            if (nums.get(reader) != 0) {
                nums.set(writer, nums.get(reader));
                writer++;
            }
        }

        // fill the remaining positions with zeros
        while (writer < nums.size()) {
            nums.set(writer, 0);
            writer++;
        }

        System.out.println(nums);
    }
}
