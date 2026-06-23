package day8;

public class MergeSort {

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        int[] temp = new int[arr.length];
        sort(arr, temp, 0, arr.length - 1);

    }

    public static void sort(int[] arr, int[] temp, int left, int right) {
        if (left >= right) {
            return;
        } 
        int mid = (left + right) / 2;
        sort(arr, temp, left, mid);
        sort(arr, temp, mid + 1, right);
        merge(arr, temp, mid, left, right);
    }

    public static void merge(int[] arr, int[] temp, int mid, int left, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;

        while(i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        while(j <= right) {
            temp[k++] = arr[j++];
        }

        for(int x = left; x <= right; x++) {
            arr[x] = temp[x];
        }

    }

    public static void main(String[] args) {
        int[] arr = { 38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
