// Date: 06/05/2025
// Day: Tuesday

// 12. Count the number of occurrences of an element
public class Q12{
    public static int countOccurences(int arr[], int k){
        int count = 0;
        for(int i : arr){
            if(i == k){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {5,8,6,3,2,5,8,5,9,5};
        System.out.println(countOccurences(arr, 5));
    }
}