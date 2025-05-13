// Date: 13/05/2025
// Day: Tuesday

// 38. Search in a row-wise and column-wise sorted matrix

public class Q38{    
    public static void search(int mat[][], int x){
        int m = mat.length, n = mat[0].length;
        int i = 0, j = n - 1;
        while(i < m && j >= 0){
            if(x > mat[i][j]){
                i++;
            }
            else if(x < mat[i][j]){
                j--;
            }
            else{
                System.out.println(i + "," + j);
                return;
            }
        }
    }

    public static void main(String[] args) {
        int mat[][] = {
            {3, 30, 38},
            {20, 52, 54},
            {35, 60, 69}
        };
        int x = 35;
        search(mat, x);
    }
}