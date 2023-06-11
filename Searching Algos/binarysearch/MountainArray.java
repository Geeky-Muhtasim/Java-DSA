package binarysearch;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 2, 5, 2, 1, 0 };
        int ans = peakSearch(arr);
        System.out.println(ans);
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
}
