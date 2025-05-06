// Date: 06/05/2025
// Day: Tuesday

// 9. Check if array is sorted and rotated
public class Q9{
    // Not done yet...
    public static boolean isSortedAndRotated(int arr[]){
        int idx = 0;
        while(idx < arr.length-1){
            if(arr[idx] < arr[idx+1]){
                break;
            }
            idx++;
        }
        int i = idx;
        while((i+1) % arr.length != idx){
            if(arr[i] > arr[(i + 1) % arr.length]){
                return false;
            }
            i++;
            i %= arr.length;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {6,5,4,1,2,3};
        System.out.println(isSortedAndRotated(arr));
    }
}