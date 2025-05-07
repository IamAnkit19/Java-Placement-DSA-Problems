// Date: 07/05/2025
// Day: Wednesday

// 15. Missing number in array [1 to n]
public class Q15{
    public static int missingNumber(int arr[]){
        if(arr[0] != 1){
            return 1;
        }
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]+1 != arr[i+1]){
                return arr[i]+1;
            }
        }
        return arr[arr.length-1] + 1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,7,8,9};
        System.out.println(missingNumber(arr));
    }
}