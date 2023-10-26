import java.util.Scanner;

public class NthTermOfGP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol= new Solution();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a=sc.nextInt();
		
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("Enter n to find the nth term of GP:");
		int n=sc.nextInt();
		System.out.println((int)Math.floor(sol.termOfGP(a,b,n)));
	}

}

class Solution
{
    
    public double termOfGP(int A,int B,int N)
    {
        //Your code here
         double r=(double)B/A;
    
         return A*(Math.pow(r,N-1));
    }

}