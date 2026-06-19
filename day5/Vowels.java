package day5;

public class Vowels {

    public static void countCharacters(String str) {
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isWhitespace(ch)) {
                spaces++;
            }
        }

        System.out.println("Vowels: "+ vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("digits: " + digits);
        System.out.println("spaces: " + spaces);
    }
    public static void main(String[] args) {
        String str = "Hello World 123";
        countCharacters(str);
    }
}
