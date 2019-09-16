package com.lqc.sword.树;

import com.lqc.sword.TreeNode;

import java.util.Arrays;

/**
 * @author liqicong@myhexin.com
 * @date 2019/9/16 14:09
 */
public class 中序后序找前序 {
    public TreeNode reConstructBinaryTree(int [] after, int [] in) {
        if(after.length!=in.length||after.length==0){
            return null;
        }
        TreeNode root=new TreeNode(after[after.length-1]);
        for(int i=0;i<in.length;i++){
            if(in[i]==after[after.length-1]){
                root.left=reConstructBinaryTree(Arrays.copyOfRange(after,0,i),Arrays.copyOfRange(in,0,i));
                root.right=reConstructBinaryTree(Arrays.copyOfRange(after,i,after.length-1),Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        return root;


    }
}
