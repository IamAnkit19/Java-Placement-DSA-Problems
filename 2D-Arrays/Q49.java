// Date: 22/05/2025
// Day: Thursday

// 49. Maximum size rectangle of all 1s in binary matrix

public class Q49{    
    public static int maxSizeRec(int mat[][]){
        int m = mat.length;
        int n = mat[0].length;
        int maxArea = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] == 1){
                    int minWidth = Integer.MAX_VALUE;
                    for(int k = i; k < m && mat[k][j] == 1; k++){
                        int width = 0;
                        while(j + width < n && mat[k][j + width] == 1){
                            width++;
                        }
                        minWidth = Math.min(minWidth, width);
                        int height = k - i + 1;
                        int area = minWidth * height;
                        maxArea = Math.max(maxArea, area);
                    }
                }
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int mat1[][] = {
            {1,0,1,0,0},
            {1,0,1,1,1},
            {1,1,1,1,1},
            {1,0,0,1,0}
        };
        System.out.println(maxSizeRec(mat1));
        int mat2[][] = {
            {1,0,1,0,0},
            {1,0,1,1,1},
            {1,1,1,0,1},
            {1,0,0,1,0}
        };
        System.out.println(maxSizeRec(mat2));
    }
}