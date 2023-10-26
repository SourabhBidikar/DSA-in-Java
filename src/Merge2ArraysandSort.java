
public class Merge2ArraysandSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1= {5,4,30,28,2};
		int[] a2= {78,95,65,42,75,44,4,1};
		
		int[] res= mergeAndSort2Array(a1,a2);
		
		for(int elem:res) {
			System.out.print(elem+" ");
			
		}
	}
	
	static int[] mergeAndSort2Array(int[] a1, int[] a2) {
		
			int n1=a1.length;
			int n2=a2.length;
			
			int[] res= new int[n1+n2];
			
			int i=0;
			int j=0;
			int k=0;
			
			while(i<n1) {
				res[k]=a1[i];
				i++;
				k++;
			}
			
			while(j<n2) {
				res[k]=a2[j];
				j++;
				k++;
			}
			
			
			int temp;
			for(int m=0;m<res.length-1;m++) {
				for(int n=0;n<res.length-m-1;n++) {
					if(res[n]>res[n+1]) {
						temp=res[n];
						res[n]=res[n+1];
						res[n+1]=temp;
					}
				}
			}
			
			return res;
	}
}
