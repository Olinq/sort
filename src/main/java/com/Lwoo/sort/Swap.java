package com.Lwoo.sort;

public class Swap {
	public static void swap(int[] nums,int index){
		int temp=nums[index];
		nums[index]=nums[index+1];
		nums[index+1]=temp;
	}
}
