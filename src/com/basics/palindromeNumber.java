package com.basics;

public class palindromeNumber {

	public static void main(String[] args) {
		
		
		int n=12321;
		System.out.println(isPalindrome(n));

	}
	
	public static boolean isPalindrome(int num) {
		
		
		int temp=num;
		int rem=0,rev=0;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		if(temp==rev) return true;
		return false;
	}

}
