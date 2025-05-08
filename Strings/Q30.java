// Date: 08/05/2025
// Day: Thursday

// 30. Valid Palindrome after removing at most one character
public class Q30{    
    public static String removeChar(String str, int idx){
        String s = "";
        for(int i=0; i<str.length(); i++){
            if(i == idx)
                continue;
            s = s + str.charAt(i);
        }
        return s;
    }

    public static boolean isPalindrome(String str){
        int l = 0, r = str.length() - 1;
        while(l < r){
            if(str.charAt(l) != str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    
    public static boolean isValidPalindrome(String str){
        int l = 0, r = str.length() - 1;
        while(l < r){
            if(str.charAt(l) == str.charAt(r)){
                l++;
                r--;
                continue;
            }
            else{
                String s1 = removeChar(str, l);
                if(isPalindrome(s1) == true){
                    return true;
                }
                String s2 = removeChar(str, r);
                if(isPalindrome(s2) == true){
                    return true;
                }
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String s1 = "racecxar";
        System.out.println(isValidPalindrome(s1));
    }
}