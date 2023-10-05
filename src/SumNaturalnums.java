import java.util.Scanner;

public class SumNaturalnums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter n: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		double time1=System.currentTimeMillis();
		int sum1= basicSum(n);
		System.out.println("basic Sum of "+n+" is "+sum1);
		System.out.println("Time taken by basic= "+(System.currentTimeMillis()-time1)+" millis");
		
		double time2=System.currentTimeMillis();
		int sum2= optimalSum(n);
		System.out.println("optimal Sum of "+n+" is "+sum2);
		System.out.println("Time taken by optimal= "+(System.currentTimeMillis()-time2)+" millis");
	}




//basic solution
static int basicSum(int n){
	int sum=0;
	for(int i=0;i<=n;i++) {
		sum=sum+i;
	}
	return sum;
}

static int optimalSum(int n) {
	return n*(n+1)/2;
}
}
