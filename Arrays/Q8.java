// Date: 06/05/2025
// Day: Tuesday

// 8. Kadane's Algorithm - Maximum Subarray Sum
public class Q8{
    public static int kadanesAlgo(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<arr.length; i++){
            currSum += arr[i];
            maxSum = Math.max(maxSum, currSum);
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {5,3,-8,6,9,-3,-2,4,-1};
        System.out.println(kadanesAlgo(arr));
    }
}