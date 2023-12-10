import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println("String= "+str);
        Solution sol= new Solution();
        String res=sol.lowerToUpper(str);
        System.out.println(res);

        sc.close();
        
        System.out.println(2%2);
    }
}



public class Solution{
    
}