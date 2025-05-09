// Date: 09/05/2025
// Day: Friday

// 32. Longest substring without repeating characters
public class Q32{  
    public static int longestSubstringWihtoutRepetation(String str){
        String s = "";
        int maxCount = 0;
        for(int i=0; i<str.length(); i++){
            char x = str.charAt(i);
            int index = s.indexOf(x);
            if(index != -1){
                s = s.substring(index + 1);
            }
            s = s + x;
            maxCount = Math.max(maxCount, s.length());
        }
        return maxCount;
    }
    
    public static void main(String[] args) {
        String str = "abcabckbd";
        System.out.println(longestSubstringWihtoutRepetation(str));
    }
}