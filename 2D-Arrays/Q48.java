// Date: 19/05/2025
// Day: Friday

// 48. Find median in a row-wise sorted matrix

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q48{    
    // public static int countSmallerOrEqual(int[] row, int target) {
    //     int low = 0, high = row.length - 1;
    //     while (low <= high) {
    //         int mid = (low + high) / 2;
    //         if (row[mid] <= target) {
    //             low = mid + 1;
    //         } else {
    //             high = mid - 1;
    //         }
    //     }
    //     return low;
    // }

    // public static int findMedian(int[][] matrix) {
    //     int r = matrix.length;
    //     int c = matrix[0].length;
    //     int min = matrix[0][0];
    //     int max = matrix[0][c - 1];
    //     for(int i = 1; i < r; i++){
    //         min = Math.min(min, matrix[i][0]);
    //         max = Math.max(max, matrix[i][c - 1]);
    //     }

    //     int desired = (r * c + 1) / 2;
    //     while(min < max){
    //         int mid = (min + max) / 2;
    //         int count = 0;

    //         for(int i = 0; i < r; i++){
    //             count += countSmallerOrEqual(matrix[i], mid);
    //         }

    //         if (count < desired) {
    //             min = mid + 1;
    //         } else {
    //             max = mid;
    //         }
    //     }

    //     return min;
    // }

    public static int findMedian(int mat[][]){
        int m = mat.length;
        int n = mat[0].length;
        int newArr[] = new int[m * n];
        int idx = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                newArr[idx++] = mat[i][j];
            }
        }
        Arrays.sort(newArr);
        if(newArr.length%2 == 0){
            return newArr[(newArr.length/2) - 1];
        }
        return newArr[newArr.length/2];
    }

    public static void main(String[] args) {
        int mat1[][] = {
            {1, 3, 5},
            {2, 6, 9},
            {3, 6, 9}
        };
        System.out.println(findMedian(mat1));
    }
}