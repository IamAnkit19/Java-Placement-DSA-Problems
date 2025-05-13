// Date: 13/05/2025
// Day: Tuesday

// 44. Boundary traversal of matrix

public class Q44{    
    public static void boundaryTraversal(int mat[][]){
        int m = mat.length;
        int n = mat[0].length;
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        for(int i=left; i<=right; i++){
            System.out.print(mat[top][i] + " ");
        }
        top++;
        for(int i=top; i<=bottom; i++){
            System.out.print(mat[i][right] + " ");
        }
        right--;
        for(int i=right; i>=left; i--){
            System.out.print(mat[bottom][i] + " ");
        }
        bottom--;
        for(int i=bottom; i>=top; i--){
            System.out.print(mat[i][left] + " ");
        }
        left++;
    }

    public static void boundaryTraversal2(int mat[][]){
        int m = mat.length;
        int n = mat[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i == 0 || j == 0 || i == m - 1 || j == n - 1){
                    System.out.print(mat[i][j] + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int mat[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        boundaryTraversal(mat);
        System.out.println();
        boundaryTraversal2(mat);
    }
}