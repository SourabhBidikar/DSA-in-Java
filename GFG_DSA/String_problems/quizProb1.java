package GFG_DSA.String_problems;
import java.util.*;

public class quizProb1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println("String= "+str);
        Solution sol= new Solution();
        String res=sol.lowerToUpper(str);
        System.out.println(res);

        sc.close();
    }
}

/*Complete the function lowerToUpper such that it takes a string and returns a string where if there are two consecutive letters in the input string then  they are replaced by their capital version in the output String.*/

/*sample input = "geeksforgeeks" */
/*sample output=  "gEksforgEks"*/

public class Solution{
    String lowerToUpper(String s){
 // code here
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < s.length() - 1) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                result.append(Character.toUpperCase(s.charAt(i)));
                i += 2;
            } else {
                result.append(s.charAt(i));
                i++;
            }
        }
        if (i < s.length()) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }
}