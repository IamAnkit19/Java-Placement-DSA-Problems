// Date: 13/05/2025
// Day: Tuesday

// 39. Spiral traversal of a matrix

public class Q39{    
    public static void spiralTraversal(int mat[][]){
        int m = mat.length;
        int n = mat[0].length;
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        while(top <= bottom && left <= right){
            for(int i=left; i<=right; i++){
                System.out.print(mat[top][i] + " ");
            }
            top++;
            for(int i=top; i<=bottom; i++){
                System.out.print(mat[i][right] + " ");
            }
            right--;
            if(top <= bottom){
                for(int i=right; i>=left; i--){
                    System.out.print(mat[bottom][i] + " ");
                }
                bottom--;
            }
            if(left <= right){
                for(int i=bottom; i>=top; i--){
                    System.out.print(mat[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int mat[][] = {
            {3, 30, 38},
            {20, 52, 54},
            {35, 60, 69}
        };
        spiralTraversal(mat);
    }
}