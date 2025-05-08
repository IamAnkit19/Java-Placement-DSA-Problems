// Date: 08/05/2025
// Day: Thursday

// 29. Implement strstr() (substring search)
public class Q29{     
    public static String subString(String str, int a) {
        String s = "";
        for(int i=a; i<str.length(); i++){
            s += str.charAt(i);
        }
        return s;
    }

    public static String subString(String str, int a, int b) {
        String s = "";
        for(int i=a; i<b; i++){
            if(i >= str.length()){
                break;
            }
            s += str.charAt(i);
        }
        return s;
    }
    
    public static void main(String[] args) {
        String s1 = "Hello World";
        System.out.println(subString(s1, 5));
        System.out.println(subString(s1, 2, 7));
    }
}