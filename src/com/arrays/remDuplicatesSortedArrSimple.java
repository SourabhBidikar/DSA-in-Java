package com.arrays;

import java.util.LinkedList;

public class remDuplicatesSortedArrSimple {

	public static void main(String[] args) {
		int[] nums= {1,1,2,3,3,4};
		System.out.print("Input array: ");
		for(int elem:nums) {
			System.out.print(elem+" ");
		}
		System.out.println();
		
		
		int uniqueSize=removeDuplicates(nums);
		
		System.out.println("length of unique array: "+uniqueSize);
		System.out.print("Unique Array: ");
		for(int i=0;i<uniqueSize;i++) {
			System.out.print(nums[i]+" ");
		}

	}
	
	public static int removeDuplicates(int[] nums) {
		
		int j=1;
		for(int i=1;i<nums.length;i++) {
			if(nums[i]!=nums[i-1]) {
				nums[j]=nums[i];
				j++;
			}
		}
		
		return j;
		
		
		
	}

}
