package day5;

public class Reverse {

    public static void reverse(char[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            // swap 
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        String str = "Computer";
        char[] arr = str.toCharArray();
        reverse(arr);
        System.out.println(new String(arr));
    }
}


// OTC: O(number_of_characters)
// OSC: O(1)