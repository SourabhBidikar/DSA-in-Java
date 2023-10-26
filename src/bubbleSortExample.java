import java.util.Scanner;

public class bubbleSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n=sc.nextInt();
		int[] a= new int[n];
		System.out.print("Enter array elements");
		for(int i=0; i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Array: ");
		for(int elem:a) {
			System.out.print(elem+" ");
		}
		
		System.out.println("\nArray: after sorting ");
		a= bubbleSort(a,n);
		for(int elem:a) {
			System.out.print(elem+" ");
		}
		sc.close();
}
	
	static int[] bubbleSort(int[] a, int n) {
	
		int temp;	
		for(int i=0; i<n-1;i++) {
			boolean swapped=false;
			for(int j=1;j<n-i;j++) {
				if(a[j]<a[j-1]) {
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
					swapped=true;
				}
			}
			if(swapped==false) return a;
		}
		return a;
	}
}
