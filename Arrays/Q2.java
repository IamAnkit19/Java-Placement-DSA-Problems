// Date: 05/05/2025
// Day: Monday

// 2. Reverse an array in place
public class Q2 {
    public static void rev(int arr[]){
        int l = 0;
        int r = arr.length-1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        rev(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}