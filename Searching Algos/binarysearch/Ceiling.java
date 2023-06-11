package binarysearch;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 14, 17, 19, 24, 29 };
        int target = 10;
        // int[] arr2 = { 90, 86, 83, 77, 71, 69, 63, 50, 42, 37, 25, 13, 5 };
        int ans = ceil(arr, target);
        // int ans2 = binarySearchAg(arr2, target);
        System.out.println(ans);
    }

    static int ceil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        while (start <= end) {
            // find the mid element of the array
            // int mid = (start+end)/2; not applicabel for large values
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }

}
