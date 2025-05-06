// Date: 06/05/2025
// Day: Tuesday

// 10. Leaders in an array
public class Q10{
    public static int leader(int arr[]){
        int n = arr.length;
        int currLeader = arr[n-1];
        for(int i=n-1; i>=0; i--){
            if(arr[i] > currLeader){
                currLeader = arr[i];
            }
        }
        return currLeader;
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,1,2,3};
        System.out.println(leader(arr));
    }
}