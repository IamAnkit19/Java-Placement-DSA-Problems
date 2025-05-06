// Date: 06/05/2025
// Day: Tuesday

// 9. Check if array is sorted and rotated
public class Q9{
    public static boolean isSortedAndRotated(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > arr[(i + 1) % arr.length]){
                count++;
            }
        }
        return count <= 1;

        // int idx = 0;
        // while(idx < arr.length-1){
        //     if(arr[idx] < arr[idx+1]){
        //         break;
        //     }
        //     idx++;
        // }
        // int i = idx;
        // while((i+1) % arr.length != idx){
        //     if(arr[i] > arr[(i + 1) % arr.length]){
        //         return false;
        //     }
        //     i++;
        //     i %= arr.length;
        // }
        // return true;
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,1,2,3};
        System.out.println(isSortedAndRotated(arr));
    }
}