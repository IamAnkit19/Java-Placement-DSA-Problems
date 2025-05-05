// Date: 05/05/2025
// Day: Monday

public class Q1{
    public static int minVal(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int val : arr){
            if(val < min){
                min = val;
            }
        }
        return min;
    }

    public static int maxVal(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int val : arr){
            if(val > max){
                max = val;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(minVal(arr));
        System.out.println(maxVal(arr));
    }
}