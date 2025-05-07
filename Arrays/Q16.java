// Date: 07/05/2025
// Day: Wednesday

// 16. Find duplicate number in array
public class Q16{
    public static void sort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static int findDuplicate(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,6,7,8,9};
        sort(arr);
        System.out.println(findDuplicate(arr));
    }
}