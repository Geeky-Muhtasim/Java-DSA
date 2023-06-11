package binarysearch;

public class OrderAgnuisticBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 90, 86, 83, 77, 71, 69, 63, 50, 42, 37, 25, 13, 5 };
        int target = 42;
        int ans = binarySearchAg(arr, target);
        System.out.println(ans);
    }

    public static int binarySearchAg(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            // find the mid element of the array
            // int mid = (start+end)/2; not applicabel for large values
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (!isAsc) {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
