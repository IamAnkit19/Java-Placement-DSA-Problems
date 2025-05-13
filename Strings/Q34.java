// Date: 13/05/2025
// Day: Tuesday

// 34. Check if a string is a rotation of another string

public class Q34{
    public static boolean isRotation(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        int n = s1.length();
        for(int i=0; i<n; i++){
            if(s1.equals(s2)){
                return true;
            }
            char last = s1.charAt(s1.length()-1);
            s1 = last + s1.substring(0, s1.length() - 1);
        }
        return false;
    }
    
    public static void main(String[] args) {
        String s1 = "ankit";
        String s2 = "kitan";
        System.out.println(isRotation(s1, s2));
    }
}