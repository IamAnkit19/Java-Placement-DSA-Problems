// Date: 21/05/2025
// Day: Wednesday

// 50. Boolean Matrix problem (set row/column to 1 if any element is 1)

public class Q50{    
    public static void solve(int mat[][], int row, int col){
        int i = 0, j = 0;
        while(j < mat[row].length){
            mat[row][j++] = 1;
        }
        while(i < mat.length){
            mat[i++][col] = 1;
        }
    }

    public static void set1InRowCol(int mat[][]){
        int m = mat.length;
        int n = mat[0].length;
        int temp[][] = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                temp[i][j] = 0;
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j] == 1){
                    solve(temp, i, j);
                }
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = temp[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int mat1[][] = {
            {1,0,0,0,0},
            {0,0,0,0,0},
            {1,0,0,1,1},
            {0,0,0,0,0}
        };
        set1InRowCol(mat1);
        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[i].length; j++){
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }
    }
}