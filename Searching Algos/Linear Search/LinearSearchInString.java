// Time Complexity -> Best Case O(1) Finding target in 1st index || Worst Case O(N) N is the size of the array 

import java.util.Arrays;

public class LinearSearchInString {

    public static void main(String[] args) {
        // int[] num = { 24, 50, 1, 3, -5, 13, 16, 26, -11 };
        String name = "Muhtasim";
        char target = 't';
        boolean ans = linearSearch(name, target);
        boolean ansE = linearSearchChar(name, target);
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(ans);
        System.out.println(ansE);
    }

    // search in array -> return the index if item is found
    static boolean linearSearch(String name, char target) {
        if (name.length() == 0) {
            return false;
        }

        // run for loop
        for (int i = 0; i < name.length(); i++) {
            // check for element at every index if its equal to target
            if (target == name.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static boolean linearSearchChar(String name, char target) {
        if (name.length() == 0) {
            return false;
        }

        // run for loop
        for (char ch : name.toCharArray()) {
            // check for element at every index if its equal to target
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
