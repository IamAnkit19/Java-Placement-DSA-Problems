// Date: 07/05/2025
// Day: Wednesday

// 20. Maximum Product Subarray
public class Q20{   
    public static int maximumProductSubarray(int arr[]){
        int maxProduct = 1;
        int currProduct = 1;
        int last = 0;
        for(int i=0; i<arr.length; i++){
            currProduct = 1;
            for(int j=i; j<arr.length; j++){
                currProduct *= arr[j];
                if(currProduct > maxProduct){
                    maxProduct = currProduct;
                    last = j;
                }
            }
        }
        int temp = maxProduct;
        while(temp != 1){
            System.out.print(arr[last]+" ");
            temp /= arr[last];
            last--;
        }
        System.out.println();
        return maxProduct;
    }
    
    public static void main(String[] args) {
        int arr[] = {5,-9,-6,3,4,-7};
        System.out.println(maximumProductSubarray(arr));
    }
}