// Date: 07/05/2025
// Day: Wednesday

// 17. Find intersection of two sorted arrays
public class Q17{
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

    public static void intersection(int arr1[], int arr2[]){
        int ans[] = new int[arr1.length+arr2.length];
        int idx = 0;
        int i = 0, j = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                ans[idx++] = arr1[i];
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        for(int k=0; k<idx; k++){
            System.out.println(ans[k]);
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3,5,6,7,8,9};
        int arr2[] = {1,6,3,8,9,5};
        sort(arr1);
        sort(arr2);
        intersection(arr1, arr2);
    }
}