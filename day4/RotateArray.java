package day4;

import java.util.ArrayList;

public class RotateArray {

    public static void reverse(ArrayList<Integer> arr, int start, int end) {
        while (start < end) {
            // swapping of numbers 
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        int k = 4;
        int n = arr.size();
        k = k % n;

        // Reverse entire array
        reverse(arr, 0, n - 1);

        // reverse first k elements 
        reverse(arr, 0, k - 1);

        // reverse remaining elements
        reverse(arr, k , n-1);

        System.out.println(arr);

    }
}

// OTC: O(no_of_elements_in_the_array)
// O(1)