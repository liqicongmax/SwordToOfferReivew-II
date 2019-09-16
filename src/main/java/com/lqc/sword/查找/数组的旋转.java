package com.lqc.sword.查找;

/**
 * @author liqicong@myhexin.com
 * @date 2019/9/16 14:56
 */
public class 数组的旋转 {
    /**
     * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
     * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
     * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
     * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
     */
    private int minNumberInRotateArray(int[] array){
        if(array.length==0){
            return 0;
        }
        int start=0;
        int middle=0;
        int end=array.length-1;
        while (start<end){
            middle=start+((end-start)>>1);
            if(array[middle]>array[end]){
                start=middle+1;
            }else if(array[middle]==array[end]){
                end--;
            }else{
                end=middle;
            }
        }
        return array[start];
    }
    public static void main(String[] args){
        int[] arr={3,4,5,1,2};
        System.out.println(new 数组的旋转().minNumberInRotateArray(arr));
    }
}
