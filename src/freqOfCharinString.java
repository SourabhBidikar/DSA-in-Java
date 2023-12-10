
public class freqOfCharinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="HEykjlaKdqjdsaq";
		s1=s1.toUpperCase();
		
		char[] a1=s1.toCharArray();
		
		int[] countArray= new int[26];
		

		
		for(int i=0;i<a1.length;i++) {
			countArray[((int)a1[i]-65)]++;
		}
		
		for(int i=0;i<countArray.length;i++) {
			if(countArray[i]>0) {
				System.out.println((char)(i+65)+" --> "+countArray[i]);
			}
		}
	}
	
	

}
