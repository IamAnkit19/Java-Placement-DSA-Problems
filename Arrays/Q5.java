// Date: 06/05/2025
// Day: Tuesday

// 5. Move all negative numbers to beginning and positive to end
public class Q5{
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

    public static void main(String[] args) {
        int arr[] = {5,3,-8,6,9,-3,-2,4,-1};
        sort(arr);
        for(int val : arr){
            System.out.println(val);
        }
    }
}