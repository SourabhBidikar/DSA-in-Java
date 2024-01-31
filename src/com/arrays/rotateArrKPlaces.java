package com.arrays;

public class rotateArrKPlaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7};
		int k=3;
		int n=arr.length;
		rotateArr(arr, n,k);
		
		System.out.print("rotated array:");
		for(int elem:arr) {
			System.out.print(elem+" ");
		}
	}
	
	public static void rotateArr(int[] arr, int n,int k) {
		
		k=k%n;
		partRev(arr, 0, n-1);
		partRev(arr, 0, k-1);
		partRev(arr, k, n-1);
	}
	
	public static void partRev(int[] arr, int start, int end) {
		
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
	}
}
