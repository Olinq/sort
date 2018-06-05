package com.Lwoo.sort;

public class InsertSort {
    /**
     * 直接插入排序
     * 稳定性：稳定
     * 时间复杂度O（n²）
     * @param nums
     */
    public static void insertSort(int[] nums){
        int temp;
        int j;
        for(int i=1;i<nums.length;i++){//n个数，以第一个数为有序队列 循环n-1次
            temp=nums[i];
            for(j=i;j>0;j--){//无序队列的第一个值与有序队列的值注意比较
                if(nums[j-1]<temp){//找到对应位置跳出比较
                    break;
                }
                nums[j]=nums[j-1];//较大的数字向后移
            }
            if(j!=i)//放置到对应位置
                nums[j]=temp;
        }
    }

}
