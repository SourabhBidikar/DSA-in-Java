import java.util.Scanner;

public class FibonacciNthTerm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=sc.nextInt();
		
		System.out.println(basicFibo(n));
		
		System.out.println(optimalFibo(n));
		
		
	}
	
	
	static int basicFibo(int n) {
		int a=0,b=1,c;
		
		if(n==0) return a;
		if(n==1|n==2) return b;
		
		for(int i=2;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		
		return b;
	}
	
	
	
	static int optimalFibo(int n) {
		if(n==0) return 0;
		if(n==1|n==2) return 1;
		
		return optimalFibo(n-1)+optimalFibo(n-2);
	}

}
