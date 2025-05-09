// Date: 09/05/2025
// Day: Friday

// 26. Count and say problem
public class Q26{      
    // public static int frequency(char str[], char c, int idx){
    //     int count = 0;
    //     for(int i=idx; i<str.length; i++){
    //         if(str[i] != c){
    //             break;
    //         }
    //         if(str[i] == c){
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    public static String compress(char str[]){
        String s = "";
        for(int i=0; i<str.length; i++){
            int count = 1;
            while(i < str.length - 1 && str[i] == str[i+1]){
                count++;
                i++;
            }
            s = s + count + str[i];
        }
        return s;
    }

    public static String helper(String s, int n){
        if(n == 1){
            return s;
        }
        char str[] = s.toCharArray();
        s = compress(str);
        return helper(s, n-1);
    }
    
    public static String countAndSay(int n){
        String s = "1";
        return helper(s, n);
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(6));
    }
}