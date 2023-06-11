package binarysearch;

public class PositionOfElementInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int target = 13;
        int ans = findingPosition(arr, target);
        System.out.println(ans);
    }

    static int findingPosition(int[] arr, int target) {
        int start = 0;
        int end = 1;
        // condition for the target to lie in the range
        while (target > arr[end]) {
            int newStart = end + 1;
            // end = prevEnd + sizeOfBox*2
            end = end + (end - start) * 2;
            start = newStart;
        }
        return infiniteSearch(arr, target, start, end);
    }

    static int infiniteSearch(int[] arr, int target, int start, int end) {
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
        return -1;
    }
}
