// Date: 15/05/2025
// Day: Thursday

// 47. Count islands (DFS on matrix)

public class Q47{    
    public static void dfs(int[][] matrix, int row, int col){
        int rows = matrix.length;
        int cols = matrix[0].length;
        if(row < 0 || row >= rows || col < 0 || col >= cols || matrix[row][col] == 0){
            return;
        }
        matrix[row][col] = 0;

        dfs(matrix, row + 1, col);
        dfs(matrix, row - 1, col);
        dfs(matrix, row, col + 1);
        dfs(matrix, row, col - 1);
    }

    public static int countIslands(int[][] mat){
        if(mat == null || mat.length == 0){
            return 0;
        }
        int numRows = mat.length;
        int numCols = mat[0].length;
        int numIslands = 0;
        for(int i = 0; i < numRows; i++){
            for(int j = 0; j < numCols; j++){
                if(mat[i][j] == 1){
                    numIslands++;
                    dfs(mat, i, j);
                }
            }
        }
        return numIslands;
    }

    public static void main(String[] args) {
        int mat[][] = {
            {1,1,1,1,0},
            {1,1,0,1,0},
            {1,1,0,0,0},
            {0,0,0,1,0}
        };
        System.out.println(countIslands(mat));
    }
}