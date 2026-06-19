package day5;

public class Anagram {

    public static boolean isAnagram(String s1, String s2) {
        int[] freq = new int[26];
        for(int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }
        
        // check for anagram
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
            String s1 = "listen";
            String s2 = "silent";
            if(isAnagram(s1, s2)) {
                System.out.println("Anagrams");
            } else {
                System.out.println("Not Anagrams ... ");
            }
    }
}
