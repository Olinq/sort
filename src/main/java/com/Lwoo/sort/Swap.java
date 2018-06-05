package com.Lwoo.sort;

public class Swap {
	public static void swap(int[] nums,int index){
		int temp=nums[index];
		nums[index]=nums[index+1];
		nums[index+1]=temp;
	}
	public static void swapTwo(int[] nums,int i,int j){
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=nums[temp];
	}
}
