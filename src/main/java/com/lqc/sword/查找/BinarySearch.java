package com.lqc.sword.查找;

import java.util.Arrays;

/**
 * @author liqicong@myhexin.com
 * @date 2019/9/16 19:04
 */
public class BinarySearch {
    /**
     * 典型的二分查找
     */
    private int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<=end){
            mid=start+((end-start)>>1);
            if(target<arr[mid]){
                end=mid-1;
            } else if(target>arr[mid]){
                start=mid+1;
            }else if(arr[mid]==target){
                return mid;
            }

        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        System.out.println(new BinarySearch().binarySearch(arr,5));
        System.out.println(Arrays.toString("a.b.c".split("\\.")));
    }
}
