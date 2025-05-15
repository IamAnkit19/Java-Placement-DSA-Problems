// Date: 15/05/2025
// Day: Thursday

// 45. Pascal's Triangle

public class Q45{    
    public static long ncr(int n, int r){
        long res = 1;
        for(long i=0; i<r; i++){
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    public static void pascalTriangle(int n){
        long arr[] = new long[n];
        for(int i=0; i<n; i++){
            arr[i] = ncr(n-1, i);
        }
        for(long val : arr){
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        pascalTriangle(7);
    }
}