// Date: 08/05/2025
// Day: Thursday

// 31. Compress the string (like Leetcode 443)
public class Q31{  
    public static int frequency(char str[], char c){
        int count = 0;
        for(int i=0; i<str.length; i++){
            if(str[i] == c){
                count++;
            }
        }
        return count;
    }

    public static String compress(char str[]){
        String s = "";
        for(int i=0; i<str.length; i++){
            int count = frequency(str, str[i]);
            while(i < str.length - 1 && str[i] == str[i+1]){
                i++;
            }
            s = s + str[i];
            if(count > 1){
                s = s + count;
            }
        }
        return s;
    }
    
    public static void main(String[] args) {
        String s1 = "aaabbbbc";
        char str[] = s1.toCharArray();
        System.out.println(compress(str));
    }
}