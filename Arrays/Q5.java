// Date: 06/05/2025
// Day: Tuesday

public class Q5{
    public static void sort(int arr[]){
        int numCount[] = {0,0,0};
        // int zerosCount = 0;
        // int onesCount = 0;
        // int twoscount = 0;
        for(int i : arr){
            if(i == 0){
                numCount[0]++;
            }
            else if(i == 1){
                numCount[1]++;
            }
            else{
                numCount[2]++;
            }
        }
        int idx = 0;
        for(int i=0; i<3; i++){
            int count = 0;
            while(count < numCount[i]){
                arr[idx++] = i;
                count++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {};
        sort(arr);
        for(int val : arr){
            System.out.println(val);
        }
    }
}