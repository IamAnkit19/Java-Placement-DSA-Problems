// Date: 15/05/2025
// Day: Thursday

// 46. Search a 2D matrix (Leetcode 74)

public class Q46{    
    public static boolean search(int mat[][], int target){
        for(int i=0; i<mat.length-1; i++){
            if(mat[i+1][0] > target){
                int l = 0, h = mat[i].length - 1;
                while(l <= h){
                    int mid = (l + h) / 2;
                    if(mat[i][mid] == target){
                        return true;
                    }
                    else if(mat[i][mid] > target){
                        h = mid - 1;
                    }
                    else{
                        l = mid + 1;
                    }
                }
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int mat[][] = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        int target = 16;
        System.out.println(search(mat, target));
    }
}