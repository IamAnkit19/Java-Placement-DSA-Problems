// Date: 13/05/2025
// Day: Tuesday

// 27. Longest common prefix

import java.util.Arrays;

public class Q27{
    public static String longestCommonPrefix(String str[]){
        String first = str[0];
        String last = str[str.length-1];
        int minLength = Math.min(first.length(), last.length());
        int i = 0;
        while(i < minLength && first.charAt(i) == last.charAt(i)){
            i++;
        }
        return first.substring(0, i);
    }

    public static void main(String[] args) {
        String str[] = {"flower", "flow", "flight"};
        Arrays.sort(str);
        System.out.println(longestCommonPrefix(str));
    }
}