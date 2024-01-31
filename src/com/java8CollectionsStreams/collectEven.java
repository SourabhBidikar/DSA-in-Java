package com.java8CollectionsStreams;

import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class collectEven {

	public static void main(String[] args) {
		
		List<Integer> li=Arrays.asList(12,4,2,3,5,6,8,9,7);
		
		System.out.println(li);
		
		List<Integer> evenLi= li.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(evenLi);
		
		List<Integer> evenSortedLi= li.stream().sorted().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(evenSortedLi);
		
	}

}
