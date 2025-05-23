// Date: 06/05/2025
// Day: Tuesday

// 4. Sort an array of 0s, 1s and 2s (Dutch National Flag Problem)
public class Q4 {
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
        int arr[] = {0,2,1,0,1,0,0,2,2,1,1,0,1,2,0};
        sort(arr);
        for(int val : arr){
            System.out.println(val);
        }
    }
}
