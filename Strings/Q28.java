// Date: 08/05/2025
// Day: Thursday

// 28. Convert string to integer (like atoi)
public class Q28{         
    public static int atoi(String s){
        int num = 0;
        int i = 0;
        int sign = 1;
        while(s.charAt(i) == ' '){
            i++;
        }
        if(s.charAt(i) == '-'){
            i++;
            sign = -1;
        }
        while(i < s.length() && (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
            if(num > Integer.MAX_VALUE / 10 || num == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > 7){
                if(sign == 1){
                    return Integer.MAX_VALUE;
                }
                else{
                    return Integer.MIN_VALUE;
                }
            }
            num = 10 * num + (s.charAt(i) - '0');
            i++;
        }
        return num * sign;
    }    

    public static void main(String[] args) {
        String s1 = "  1231231231311133";
        System.out.println(atoi(s1));
        String s2 = "-999999999999";
        System.out.println(atoi(s2));
        String s3 = "-0012gfg4";
        System.out.println(atoi(s3));
        
    }
}