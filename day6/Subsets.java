package day6;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    static List<List<Integer>> result = new ArrayList<>();

    public static void generate(int[] nums, int index, List<Integer> current) {
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        // exclude
        generate(nums, index + 1, current);

        // include 
        current.add(nums[index]);
        generate(nums, index + 1, current);
        current.remove(current.size() - 1);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3, 4, 5, 6};
        generate(nums, 0, new ArrayList<>());
        System.out.println("All subsets : ");
        for(List<Integer> subset: result) {
            System.out.println(subset);
        }
    }
}
