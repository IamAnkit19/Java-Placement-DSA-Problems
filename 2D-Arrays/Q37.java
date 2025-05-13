// Date: 13/05/2025
// Day: Tuesday

// 37. Rotate matrix by 90 degrees clockwise

public class Q37{    
    public static int[][] rotate(int mat[][]){
        int ans[][] = new int[mat[0].length][mat.length];
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                ans[j][(mat.length-1-i)] = mat[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int mat1[][] = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int ans[][] = rotate(mat1);
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[i].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}