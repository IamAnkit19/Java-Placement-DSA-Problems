// Date: 05/05/2025
// Day: Monday

public class Q3 {
    public static void sort(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static int kthMinVal(int arr[], int k){
        // int min = Integer.MAX_VALUE;
        // for(int count=0; count <= k; count++){
        //     int curr = Integer.MAX_VALUE;
        //     for(int i : arr){
        //         if(i < curr && i > min){
        //             curr = i;
        //         }
        //     }
        //     min = curr;
        // }
        // return min;

        if(k <= arr.length){
            return arr[k-1];
        }
        else{
            return -1;
        }
    }

    public static int kthMaxVal(int arr[], int k){
        // int max = Integer.MIN_VALUE;
        // for(int count=0; count <= k; count++){
        //     int curr = Integer.MIN_VALUE;
        //     for(int i : arr){
        //         if(i > curr && i < max){
        //             curr = i;
        //         }
        //     }
        //     max = curr;
        // }
        // return max;

        int n = arr.length;
        if(k <= n){
            return arr[n-k];
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int k = 3;
        sort(arr);
        System.out.println(kthMinVal(arr, k));
        System.out.println(kthMaxVal(arr, k));
    }
}
