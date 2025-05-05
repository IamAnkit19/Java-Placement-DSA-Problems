// Date: 05/05/2025
// Day: Monday

public class Q3 {
    // Not done right now...
    public static int kthMinVal(int arr[], int k){
        int min = Integer.MAX_VALUE;
        int count = 0;
        for(int val : arr){
            if(val < min){
                min = val;
                count++;
            }
            if(count == k && count != 0)
                return min;
        }
        return min;
    }

    public static int kthMaxVal(int arr[], int k){
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int val : arr){
            if(val > max){
                max = val;
                count++;
            }
            if(count == k && count != 0)
                return max;
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int k = 3;
        System.out.println(kthMinVal(arr, k));
        System.out.println(kthMaxVal(arr, k));
    }
}
