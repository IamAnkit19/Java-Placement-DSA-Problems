// Date: 08/05/2025
// Day: Thursday

// 18. Trapping Rain Water
public class Q18{
    public static int trapingRainWater(int arr[]){
        int n = arr.length;
        int l = 0, r = n - 1;
        int lmax = 0, rmax = 0;
        int ans = 0;
        while(l < r){
            lmax = Math.max(lmax, arr[l]);
            rmax = Math.max(rmax, arr[r]);
            if(lmax < rmax){
                ans += lmax - arr[l];
                l++;
            }
            else{
                ans += rmax - arr[r];
                r--;
            }
        }
        return ans;

        // int n = arr.length;
        // int leftBoudary = arr[n-1];
        // int i = leftBoudary - 1;
        // int maxWater = 0;
        // int rightBoundary = 0;
        // while(i >= 0){
        //     if(arr[i] > leftBoudary){
        //         leftBoudary = arr[i];
        //         i--;
        //         continue;
        //     }
        //     int j = i;
        //     while(arr[j] <= leftBoudary && j >= 0){
        //         j--;
        //     }
        //     rightBoundary = arr[j];
        //     int boundary = Math.min(leftBoudary, rightBoundary);
        // }
    }

    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trapingRainWater(arr));
    }
}