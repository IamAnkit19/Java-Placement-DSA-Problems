// Date: 07/05/2025
// Day: Wednesday

// 22. Check for palindrome
public class Q22{      
    public static boolean isPalindrome(String s){
        int l = 0, r = s.length()-1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(isPalindrome(s));
    }
}