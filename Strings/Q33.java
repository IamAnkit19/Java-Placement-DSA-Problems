// Date: 13/05/2025
// Day: Tuesday

// 33. Group anagrams together

import java.util.ArrayList;
import java.util.List;

public class Q33{
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

    public static boolean isAnagram(String s1, String s2){
        int m = s1.length();
        int n = s2.length();
        if(m != n)
            return false;
        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();
        sort(a);
        sort(b);
        for(int i=0; i<n; i++){
            if(a[i] != b[i])
                return false;
        }
        return true;
    }

    public static List<List<String>> groupAnagrams(String str[]){
        boolean visited[] = new boolean[str.length];
        List<List<String>> result = new ArrayList<>();
        for(int i=0; i<str.length; i++){
            if(visited[i]) continue;
            List<String> group = new ArrayList<>();
            group.add(str[i]);
            visited[i] = true;
            for(int j=i+1; j<str.length; j++){
                if(!visited[j] && isAnagram(str[i], str[j])){
                    visited[j] = true;
                    group.add(str[j]);
                }
            }
            result.add(group);
        }
        return result;
    }
    
    public static void main(String[] args) {
        String str[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(str);
        for(List<String> list : result) {
            for (String list2 : list) {
                System.out.print(list2 + " ");
            }
            System.out.println();;
        }
    }
}