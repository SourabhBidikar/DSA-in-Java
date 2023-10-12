
public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= new int[] {1,2,3,4,5,6,8,9,10};
		
		System.out.println("Missing number in array from 1 to 10 is: "+findMissing(a));

	}

	static int findMissing(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(i+1!=arr[i]) return i+1;
		}
		return -1;
	}
}
