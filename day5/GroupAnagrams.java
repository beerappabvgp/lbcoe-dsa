package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> map = new HashMap<>(); 

       for(String word : strs) {
            int[] count = new int[26];
            for(char ch : word.toCharArray()) {
                count[ch - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int freq : count) {
                sb.append(freq);
                sb.append("#");
            }

            String key = sb.toString();
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
       }
       return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] input = {"eat", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(input);
        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("Output: " + result);
    }
}
