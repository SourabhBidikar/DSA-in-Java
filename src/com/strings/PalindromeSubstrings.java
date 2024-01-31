package com.strings;



public class PalindromeSubstrings {

	public static void main(String[] args) {
		
		String str= "TENET";
		System.out.println("All possible palindrome substrings for "+str);
		
		
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				String subs= str.substring(i,j+1);
				if(isPal(subs)==true) {
					System.out.println(subs);
				}
			}
		}
		
		
		
	}
	
	
	public static boolean isPal(String str) {
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) return false;
		}
		return true;
	}
	
	
	

}
