package com.java8CollectionsStreams;

import java.util.*;
import java.util.stream.Collectors;

public class removeDupfromAL {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<Integer>(Arrays.asList(6,1,2,5,4,6,3,4,4,5,1,2));
				
		usingAnotherList(list);
		
		usingSet(list);
		
		usingJava8Streams(list);
	}

	
	static void usingAnotherList(ArrayList<Integer> list) {
		List<Integer> newlist= new ArrayList<>();
		
		for(Integer elem:list) {
			if(!newlist.contains(elem)) {
				newlist.add(elem);
			}
		}

		System.out.println(newlist);
	}
	
	static void usingSet(ArrayList<Integer> list) {
		
		Set<Integer> set= new LinkedHashSet<>();
		set.addAll(list);
		list.clear();
		list.addAll(set);
		
		System.out.println(list);
		
	}
	
	static void usingJava8Streams(ArrayList<Integer> list) {
		
		List<Integer> newList=list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(newList);
		
	}
}
