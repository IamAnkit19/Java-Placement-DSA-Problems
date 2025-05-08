// Date: 08/05/2025
// Day: Thursday

// 25. Check if two strings are anagrams
public class Q25{     
    public static void sort(char arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static boolean isAnagram(char s1[], char s2[]){
        int m = s1.length;
        int n = s2.length;
        if(m != n)
            return false;
        for(int i=0; i<n; i++){
            if(s1[i] != s2[i])
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        String str1 = "ankit";
        String str2 = "katni";
        char s1[] = str1.toCharArray();
        char s2[] = str2.toCharArray();
        sort(s1);
        sort(s2);
        System.out.println(isAnagram(s1, s2));
    }
}