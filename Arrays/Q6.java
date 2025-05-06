// Date: 06/05/2025
// Day: Tuesday

// 6. Find Union and Intersection of two arrays
public class Q6{
    public static void sort(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void union(int arr1[], int arr2[]){
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
                ans[idx++] = arr1[i++];
            }
            else{
                ans[idx++] = arr2[j++];
            }
        }
        if(i < arr1.length){
            for(; i<arr1.length; i++){
                ans[idx++] = arr1[i];
            }
        }
        if(j < arr2.length){
            for(; j<arr2.length; j++){
                ans[idx++] = arr2[j];
            }
        }
        for(int k=0; k<idx; k++){
            System.out.println(ans[k]);
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
        int arr1[] = {1,2,3,4,5,6,7,8,9};
        int arr2[] = {5,3,-8,6,9,-3,-2,4,-1};
        sort(arr1);
        sort(arr2);
        union(arr1, arr2);
        intersection(arr1, arr2);
    }
}