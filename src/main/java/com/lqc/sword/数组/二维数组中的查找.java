package com.lqc.sword.数组;

/**
 * @author liqicong@myhexin.com
 * @date 2019/9/16 10:09
 */
public class 二维数组中的查找 {
    /**
     * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     */
    public boolean find(int target,int[][] arr){
        if(arr.length==0){
            return false;
        }
        //有row行
        int row=arr.length-1;
        //有col列
        int col=arr[0].length-1;
        int x=0,y=col-1;
        while (x <= row && y >= 0) {
            if(target==arr[x][col]){
                return true;
            }else if(target>arr[x][col]){
                x++;
            }else{
                col--;
            }
        }
        return false;
    }
}
