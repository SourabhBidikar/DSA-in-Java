package com.java8CollectionsStreams;

import java.util.Arrays;
import java.util.stream.Collectors;

/*Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique 
and you may return the result in any order.

		 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.*/
 

public class intersection2Arrays {

	public static void main(String[] args) {
		
		int[] nums1= {1,2,2,1};
		int[] nums2= {2,2};
		intersection(nums1,nums2);
		
		
	}
	
	public static void intersection(int[] nums1, int[] nums2) {
		
		Arrays.stream(nums1).filter(x->Arrays.stream(nums2).anyMatch(y->x==y)).distinct().forEach(System.out::print);
	}

}
