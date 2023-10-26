
public class checkIfSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {4,5,6,2,1,7,9};
		int[] b= {10,20,30,40,50,60,70};
		
		if(isSorted(b)) {
			System.out.println("Array is sorted");
		}
		
		else {
			System.out.println("Array is not sorted");
		}

	}
	
	static boolean isSorted(int[] a) {
		for(int i=1;i<a.length;i++) {
			if(a[i]<a[i-1]) return false;
		}
		return true;
	}

}
