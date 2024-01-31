package com.java8CollectionsStreams;

import java.util.*;

/*Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique 
and you may return the result in any order.

		 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.*/


public class intersection2ArraysEx2 {

	public static void main(String[] args) {
		int[] nums1= {1,2,2,1};
		int[] nums2= {2,2};
		int[] res=intersection(nums1,nums2);
		
		for(int elem:res) {
			System.out.print(elem);
		}
	}
	
	public static int[] intersection(int[]  nums1, int[] nums2) {
		
		Set<Integer> set= new LinkedHashSet<>();
		
		for(int i=0;i<nums1.length;i++) {
			for(int j=0;j<nums2.length;j++) {
				if(nums1[i]==nums2[j]) {
					set.add(nums1[i]);
				}
			}
		}
		
		
		int[] res= new int[set.size()];
		int k=0;
		
		for(Integer elem:set) {
			res[k++]=(int)elem;
		}
		
		
		return res;
		
	}

}
