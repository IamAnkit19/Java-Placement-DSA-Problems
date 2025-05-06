// Date: 06/05/2025
// Day: Tuesday

// 13. Find all pairs with a given sum
public class Q13{
    public static void findPairs(int arr[], int sum){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == sum){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {9,6,3,2,8,1,4,7};
        int sum = 11;
        findPairs(arr, sum);
    }
}