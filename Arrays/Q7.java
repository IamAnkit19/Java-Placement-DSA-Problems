// Date: 06/05/2025
// Day: Tuesday

// 7. Cyclically rotate an array by one
public class Q7{
    public static void rotate(int arr[], int k){
        for(int count = 0; count < k; count++){
            int temp = arr[0];
            for(int i=0; i<arr.length-1; i++){
                arr[i] = arr[(i+1)%arr.length];
            }
            arr[arr.length-1] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,3,-8,6,9,-3,-2,4,-1};
        rotate(arr, 3);
        for(int i : arr){
            System.out.println(i);
        }
    }
}