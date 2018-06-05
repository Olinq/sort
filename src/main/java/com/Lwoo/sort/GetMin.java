package com.Lwoo.sort;

public class GetMin {
    public static void getMin(int[] nums,int left,int right){
        int min=left+((right-left)>>1);
        int temp=nums[left];
        if((nums[left]-nums[min])*(nums[min]-nums[right])>0){
            nums[left]=nums[min];
            nums[min]=temp;
        }else if((nums[min]-nums[right])*(nums[right]-nums[left])>0) {
            nums[left] = nums[right];
            nums[right] = temp;
        }
    }
}
