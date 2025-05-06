// Date: 06/05/2025
// Day: Tuesday

// 11. Rearrange array in alternating positive & negative items
public class Q11{
    public static void rearrange(int arr[]){
        int even = 0;
        int odd = 1;
        int ans[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(arr[i] >= 0){
                ans[even] = arr[i];
                even += 2;
            }
            else{
                ans[odd] = arr[i];
                odd += 2;
            }
        }
        for(int i=0; i<ans.length; i++){
            arr[i] = ans[i];
        }
        for(int i : ans) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,-3,-9,-5,8,2,-1,7};
        rearrange(arr);
    }
}