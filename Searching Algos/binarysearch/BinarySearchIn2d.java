package binarysearch;

public class BinarySearchIn2d {
    public static void main(String[] args) {

    }

    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int column = matrix.length - 1;
        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == target) {
                return new int[] { row, column };
            }
            if (matrix[row][column] < target) {
                row++;
            } else {
                column--;
            }
        }
        return new int[] { -1, -1 };
    }
}
