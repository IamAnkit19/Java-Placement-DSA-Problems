// Date: 07/05/2025
// Day: Wednesday

// 21. Reverse a string
public class Q21{      
    public static String reverse(String s){
        char temp[] = s.toCharArray();
        int l = 0, r = temp.length-1;
        while(l < r){
            char x = temp[l];
            temp[l] = temp[r];
            temp[r] = x;
            l++;
            r--;
        }
        String ans = new String(temp);
        return ans;
    }
    
    public static void main(String[] args) {
        String s = "Ankit";
        System.out.println(reverse(s));
    }
}