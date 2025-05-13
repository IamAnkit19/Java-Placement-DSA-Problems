// Date: 13/05/2025
// Day: Tuesday

// 41. Set entire row and column to 0 if any element is 0

public class Q41{    
    public static void setZero(int mat[][]){
        int m = mat.length;
        int n = mat[0].length;
        int row = 0;
        int col = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j] == 0){
                    row = i;
                    col = j;
                }
            }
        }
        int i = 0, j = 0;
        while(j < n){
            mat[row][j++] = 0;
        }
        while(i < m){
            mat[i++][col] = 0;
        }
    }

    public static void main(String[] args) {
        int mat[][] = {
            {1,2,3},
            {4,0,6},
            {7,8,9}
        };
        setZero(mat);
        for(int is[] : mat) {
            for (int val : is) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}