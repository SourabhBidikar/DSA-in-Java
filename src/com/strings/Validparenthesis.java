package com.strings;

import java.util.Stack;


//(){}[]

public class Validparenthesis {

	public static void main(String[] args) {
		
		String str= "[[]]{}{}";
		
		System.out.println("str is "+isValid(str));
		

	}
	
	
	public static boolean isValid(String str) {
		
		char ch;
		
		Stack<Character> stack = new Stack();
		
		for(int i=0;i<=str.length()-1;i++) {
			ch=str.charAt(i);
			
			if(ch=='}') {
				if(stack.peek()=='{') {
					stack.pop();
				}
				else {
					return false;
				}
			}
			else if(ch==']') {
				if(stack.peek()=='[') {
					stack.pop();
				}
				else {
					return false;
				}
			}
			else if(ch==')') {
				if(stack.peek()=='(') {
					stack.pop();
				}
				else {
					return false;
				}
			}
			else {
				stack.push(ch);
			}
			
		}
		
		if(stack.isEmpty()) return true;
		return false;
		
	}

}
