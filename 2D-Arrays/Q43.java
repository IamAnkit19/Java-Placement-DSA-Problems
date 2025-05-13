// Date: 13/05/2025
// Day: Tuesday

// 43. Snake pattern printing

public class Q43{    
    public static void snakePattern(int mat[][]){
        int m = mat.length;
        int n = mat[0].length;
        int i = 0, j = 0;
        boolean isForward = true;
        while(i < m || j < n){
            System.out.print(mat[i][j] + " ");
            if(isForward){
                j++;
            }
            else{
                j--;
            }
            if(j == -1 || j == n){
                if(isForward){
                    isForward = false;
                    j--;
                }
                else{
                    isForward = true;
                    j++;
                }
                i++;
                if(i == m){
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int mat[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        snakePattern(mat);
    }
}