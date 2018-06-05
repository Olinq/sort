package com.Lwoo.sort;

import org.junit.Test;

import java.util.Arrays;

public class TestSort {

	@Test
	public void test(){
		int[] nums={1,5,8,7,9,6,4,3,2,0};
//		int[] nums={0,1,4,3,5,6,7,8};
//		BubbleSort.bubbleSort(nums);
//		QuickSort.quickSort(nums, 0, nums.length-1);
		InsertSort.insertSort(nums);
		System.out.println(Arrays.toString(nums));
	}

}
