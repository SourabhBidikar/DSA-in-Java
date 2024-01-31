package com.java8CollectionsStreams;
import java.util.*;

public class duplicatesinStrandCount {

	public static void main(String[] args) {

		String str= "zaaabbgghjjiiiiikkkk";
		
		Map<Character, Integer> hm= new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			Character ch=str.charAt(i);
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);		
			}
			else {				
				hm.put(ch, 1);
			}
		}

		for(Map.Entry<Character,Integer> en:hm.entrySet()) {
			System.out.println("char: "+en.getKey()+" count: "+en.getValue());
		}
	}
}