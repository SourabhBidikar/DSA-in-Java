package com.java8CollectionsStreams;

import java.util.*;
import java.util.stream.IntStream;

public class NRandomNumbersUsingJava8 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter n: ");
		int n=sc.nextInt();
		
		Random random= new Random();
		
		
		random.ints(n,1,100).forEach(System.out::println);
	}

}
