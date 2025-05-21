// Date: 21/05/2025
// Day: Wednesday

// 49. Maximum size rectangle of all 1s in binary matrix

public class Q49{    
    public static int maxSizeRec(int mat[][]){
        int m = mat.length;
        int n = mat[0].length;
        int maxCount = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int count = 1;
                if(mat[i][j] == 1){
                    int minidx = n-1;
                    while(i < m && mat[i][j] == 1){
                        int currMinIdx = 0;
                        while(j < n && mat[i][j] == 1 && currMinIdx <= minidx){
                            count++;
                            j++;
                            currMinIdx++;
                        }
                        minidx = Math.min(minidx, currMinIdx);
                        i++;
                    }
                }
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int mat1[][] = {
            {1,0,1,0,0},
            {1,0,1,1,1},
            {1,1,1,1,1},
            {1,0,0,1,0}
        };
        System.out.println(maxSizeRec(mat1));
    }
}