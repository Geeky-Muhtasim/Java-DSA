package binarysearch;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3, 1 };
        int target = 3;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
        int peak = peakSearch(arr);
        int firstTry = binarySearchAg(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return binarySearchAg(arr, target, peak + 1, arr.length - 1);
    }

    static int peakSearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // find the mid element of the array
            // int mid = (start+end)/2; not applicabel for large values
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int binarySearchAg(int[] arr, int target, int start, int end) {
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
