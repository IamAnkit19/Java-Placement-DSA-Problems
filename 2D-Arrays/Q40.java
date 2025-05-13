// Date: 13/05/2025
// Day: Tuesday

// 40. Matrix multiplication

public class Q40{    
    public static int[][] multiplication(int mat1[][], int mat2[][]){
        int m = mat1.length;
        int n = mat1[0].length;
        int ans[][] = new int[m][n];
        
        // If m == n
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int sum = 0;
                for(int k=0; k<n; k++){
                    sum += mat1[i][k] * mat2[k][j];
                }
                ans[i][j] = sum;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int mat1[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int mat2[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int ans[][] = multiplication(mat1,mat2);
        for(int is[] : ans) {
            for (int val : is) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}