package com.Lwoo.sort;

public class QuickSort {
	/**
	 * 快速排序的时间复杂度为O(nlg2n)
	 * @param nums
	 * @param left
	 * @param right
	 */
	public static void quickSort(int[] nums,int left,int right){
//		if(left<right){
//		int i=left;
//		int j=right;
//		int temp=nums[i];
//		while(i<j){
//			while(i<j&&nums[j]>temp){//从右向左查找小于中间数的数
//				j--;
//			}
//			if(i<j){
//				nums[i++]=nums[j];//nums[i++]先取了nums[i]再执行自加操作
//			}
//			while(i<j&&nums[i]<temp){//从左至右查找小于中间数的数
//				i++;
//			}
//			if(i<j){
//				nums[j--]=nums[i];//j--是先用j后面再执行自减法操作
//			}
//		}
//			nums[i]=temp;
//				quickSort(nums,left,i-1);//对左侧进行排序
//				quickSort(nums,i+1,right);//对右侧进行排序
//		}

		if(left<right){
			int i=left;
			int j=right;
			GetMin.getMin(nums,left,right);
			int temp=nums[left];
			while(i<j){
				while(i<j&&nums[j]>temp)
					j--;
				if(i<j)
					nums[i++]=nums[j];
				while(i<j&&nums[i]<temp)
					i++;
				if(i<j)
					nums[j--]=nums[i];
				nums[i]=temp;
				quickSort(nums,left,i-1);
				quickSort(nums,i+1,right);
			}
		}

	}
}
