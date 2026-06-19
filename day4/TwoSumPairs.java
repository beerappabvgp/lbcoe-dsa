package day4;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoSumPairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 5;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for(int num : arr) {
            int complement = target -num;
            if (map.containsKey(complement)) {
                int frequency = map.get(complement);

                for (int i = 0; i < frequency; i++) {
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(complement);
                    pair.add(num);
                    result.add(pair);
                }
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Pairs: ");

        for(ArrayList<Integer> pair : result) {
            System.out.println(pair.get(0) + " " + pair.get(1));
        }
    }
}
