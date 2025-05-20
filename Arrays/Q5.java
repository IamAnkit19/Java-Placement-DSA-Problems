// Date: 06/05/2025
// Day: Tuesday

// 5. Move all negative numbers to beginning and positive to end
public class Q5{
    // public static void sort(int arr[]){
    //     for(int i=0; i<arr.length; i++){
    //         for(int j=0; j<arr.length-i-1; j++){
    //             if(arr[j] > arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }
    //     }
    // }

    public static void move(int arr[]){
        int ans[] = new int[arr.length];
        int n = arr.length;
        int idx = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                ans[idx++] = 0;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                ans[idx++] = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                ans[idx++] = arr[i];
            }
        }
        for(int i=0; i<ans.length; i++){
            arr[i] = ans[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,3,-8,0,6,9,0,0,-3,-2,4,-1};
        // sort(arr);
        move(arr);
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}