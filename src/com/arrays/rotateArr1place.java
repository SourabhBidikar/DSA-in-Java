package com.arrays;

public class rotateArr1place {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		System.out.print("input array:");
		for(int elem:arr) {
			System.out.print(elem+" ");
		}
		System.out.println();
		rotateArray(arr, arr.length);
		
		System.out.print("rotated array:");
		for(int elem:arr) {
			System.out.print(elem+" ");
		}
	}
	
	static int[] rotateArray(int[] arr, int n) {
	       
		int temp=arr[0];
	    for(int i=1;i<n;i++){
	        arr[i-1]=arr[i];
	    }
	       
	    arr[n-1]=temp;
	       
	    return arr;
	}
}
