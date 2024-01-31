package com.strings;

public class PanagramString {

	public static void main(String[] args) {
		
		String str="The quick brown fox jumps over the lazy dog";
		System.out.println(isPanagram(str));

	}
	
	public static boolean isPanagram(String str) {
		
		int[] mark= new int[26];
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z') {
				mark[str.charAt(i)-'A']=1;
			}
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
				mark[str.charAt(i)-'a']=1;
			}
			else continue;
		}
		
		for(int elem:mark) {
			System.out.println(elem);
		}
		
		for(int i=0;i<mark.length;i++) {
			if(mark[i]!=1) return false;
		}
		
		return true;
	}

}
