// Date: 07/05/2025
// Day: Wednesday

// 19. Merge two sorted arrays without using extra space
public class Q19{
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

    public static void merge(int arr1[], int arr2[]){
        for(int i = arr2.length-1; i>=0; i--){
            int j = arr1.length-1;
            if(arr2[i] < arr1[j]){
                int temp = arr1[j];
                while(j > 0 && arr1[j] > arr2[i]){
                    arr1[j] = arr1[j-1];
                    j--;
                }
                arr1[j] = arr2[i];
                arr2[i] = temp;
            }
        }
    }
    
    public static void main(String[] args) {
        int arr1[] = {1,2,3,5,6,7,8,9};
        int arr2[] = {1,6,3,8,9,5};
        sort(arr1);
        sort(arr2);
        merge(arr1, arr2);
        for(int val : arr1){
            System.out.print(val+" ");
        }
        System.out.println();
        for(int val : arr2){
            System.out.print(val+" ");
        }
    }
}