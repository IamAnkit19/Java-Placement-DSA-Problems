// Date: 07/05/2025
// Day: Wednesday

// 18. Trapping Rain Water
public class Q18{
    // Not done yet...
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

    public static void main(String[] args) {
        int arr1[] = {1,2,3,5,6,7,8,9};
    }
}