package com.Lwoo.sort;

import java.util.Arrays;

import org.junit.Test;

public class TestSort {
	@Test
	public void test(){
		int[] nums={1,5,8,8,9,4,3,2,0};
//		int[] nums={0,1,4,3,5,6,7,8};
//		BubbleSort.bubbleSort(nums);
		QuickSort.quickSort(nums, 0, nums.length-1);
		System.out.println(Arrays.toString(nums));
	}
}
