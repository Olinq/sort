package com.Lwoo.sort;

public class BubbleSort {

	/**
	 * 冒泡排序是稳定的算法;
	 * 有n个数，遍历一趟时间复杂度是O(N)，需要遍历n-1次，
	 *											 时间复杂度为O(N²)
	 * @param nums
	 */
	public static void bubbleSort(int[] nums){
//		 int length=nums.length;
//		 boolean flag;//标记，是否存在交换，如果不存在交换则说明数据已经有序
//		 for(int i=0;i<length;i++){//n个数循环n-1次
//			 flag=false;
//			 for(int j=0;j<length-i-1;j++){//依次查找最大得数往后放
//				 if(nums[j]>nums[j+1]){
//					 Swap.swap(nums, j);//交换数字
//					 flag=true;
//				 }
//			 }
//			 if(flag!=true){
//				 break;
//			 }
//		 }
		 int length=nums.length;
		 boolean flag;
		 for (int i=0;i<length;i++){
			 flag=false;
		 	for (int j=0;j<length-i-1;j++){
		 		if (nums[j]>nums[j+1]){
		 			Swap.swap(nums,j);
		 			flag=true;
				}
			}
			if(!flag){
		 		break;
			}
		 }
	}
}
