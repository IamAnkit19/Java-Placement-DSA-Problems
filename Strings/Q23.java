// Date: 07/05/2025
// Day: Wednesday

// 23. Remove duplicates from a string
public class Q23{      
    public static String removeDuplicates(String s){
        String newStr = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(newStr.indexOf(c) == -1){
                newStr = newStr + c;
            }
        }
        return newStr;
    }
    
    public static void main(String[] args) {
        String s = "shgfjgkjjdoijg";
        System.out.println(removeDuplicates(s));
    }
}