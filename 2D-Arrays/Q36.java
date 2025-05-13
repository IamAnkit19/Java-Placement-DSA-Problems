// Date: 13/05/2025
// Day: Tuesday

// 36. Transpose of a matrix

public class Q36{
    public static int[][] transpose(int mat[][]){
        int ans[][] = new int[mat[0].length][mat.length];
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                ans[j][i] = mat[i][j];
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int mat[][] = {{1,2,3},{4,5,6}};
        int ans[][] = transpose(mat);
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[i].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}