// Date: 13/05/2025
// Day: Tuesday

// 35. Check if one string is a subsequence of another

public class Q35{
    public static boolean isSubsequence(String s1, String s2){
        int idx = 0;
        for(int i=0; i<s2.length() && idx<s1.length(); i++){
            if(s1.charAt(idx) == s2.charAt(i)){
                idx++;
            }
        }
        return idx == s1.length();
    }
    
    public static void main(String[] args) {
        String s1 = "ace";
        String s2 = "abcde";
        System.out.println(isSubsequence(s1, s2));
    }
}