package com.arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {15,45,75,0,1,25,0,1,0,3,12};
		
		for(int i=0;i<nums.length;i++) {
			for(int j=1;j<nums.length;j++) {
				if(nums[j-1]==0) {
					int temp=nums[j-1];
					nums[j-1]=nums[j];
					nums[j]=temp;
				}
			}
		}
		
		for(int elem:nums) {
			System.out.print(elem+" ");
		}

	}
	
	
	
}
