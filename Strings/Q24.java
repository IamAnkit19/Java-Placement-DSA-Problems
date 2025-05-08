// Date: 08/05/2025
// Day: Thursday

// 24. Print all permutations of a string
public class Q24{      
    // public static void permutations(String s){
    //     for(int i=0; i<s.length(); i++){
    //         for(int j=i; j<s.length(); j++){
    //             for(int k=i; k<=j; k++){
    //                 System.out.print(s.charAt(k));
    //             }
    //             System.out.println();
    //         }
    //     }
    // }

    public static void permutations(int i, char str[]){
        if(i == str.length){
            for(int j = 0; j < str.length; j++){
                System.out.print(str[j]);
            }
            System.out.print(" ");
            return;
        }
        for(int idx = i; idx < str.length; idx++){
            char temp = str[idx];
            str[idx] = str[i];
            str[i] = temp;
            permutations(idx + 1, str);
            temp = str[idx];
            str[idx] = str[i];
            str[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        String s = "Ankit";
        char str[] = s.toCharArray();
        permutations(0,str);
    }
}