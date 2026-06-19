package day5;

import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatingSubstring {

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }

            charSet.add(s.charAt(right));

            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println("Length of longest substring: " + result);
    }
}
