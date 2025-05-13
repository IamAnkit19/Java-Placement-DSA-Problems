// Date: 13/05/2025
// Day: Tuesday

// 42. Print diagonals of a matrix

public class Q42{    
    public static void printDiagonals(int mat[][]){
        int n = mat.length;
        // Note: It should a square matrix...
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == j || i + j == n-1){
                    System.out.print(mat[i][j]);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int mat[][] = {
            {1,2,3},
            {4,0,6},
            {7,8,9}
        };
        printDiagonals(mat);
    }
}