// Time Complexity -> Best Case O(1) Finding target in 1st index || Worst Case O(N) N is the size of the array 

public class LinearSearch {
    /**
     * 
     */
    public static void main(String[] args) {
        int[] num = { 24, 50, 1, 3, -5, 13, 16, 26, -11 };
        int target = 123;
        int ans = linearSearch(num, target);
        int ansE = linearSearchEle(num, 13);
        System.out.println(ans);
        System.out.println(ansE);
    }

    // search in array -> return the index if item is found
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run for loop
        for (int i = 0; i < arr.length; i++) {
            // check for element at every index if its equal to target
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }

    static int linearSearchEle(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run for loop
        for (int element : arr) {
            // check for element at every index if its equal to target
            if (element == target) {
                return element;
            }
        }
        return -1;
    }
}
