package com.arrays;

import java.util.*;

public class remDuplicatesSortedArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,1,2,3,3,4};
		System.out.print("Input array: ");
		for(int elem:nums) {
			System.out.print(elem+" ");
		}
		System.out.println();
		
		System.out.print("Unique Array: ");
		int uniqueSize=removeDuplicates(nums);
		
		for(int i=0;i<uniqueSize;i++) {
			System.out.print(nums[i]+" ");
		}

	}
	
	public static int removeDuplicates(int[] nums) {

        Set<Integer> s= new TreeSet<>();
       
       for(int i=0;i<nums.length;i++){
           s.add((Integer)nums[i]);
       }

        Iterator itr= s.iterator();
        int i=0;
        while(itr.hasNext()){
            nums[i]=(int)itr.next();
            i++;
        }
        
        return s.size();
    }

}
