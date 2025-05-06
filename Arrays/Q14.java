// Date: 06/05/2025
// Day: Tuesday

// 14. Subarray with given sum (Two pointer / Sliding window)
public class Q14{
    public static void subarrayWithGivenSum(int arr[], int sum){
        int currSum = 0;
        int start = 0, end = 0;
        for(int i=0; i<arr.length; i++){
            currSum += arr[i];
            if(currSum >= sum){
                end = i;
                while(currSum > sum && start < end){
                    currSum -= arr[start];
                    start++;
                }
                if(currSum == sum){
                    for(int j=start; j<=end; j++){
                        System.out.print(arr[j]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {9,6,3,2,8,1,4,7};
        int sum = 11;
        subarrayWithGivenSum(arr, sum);
    }
}