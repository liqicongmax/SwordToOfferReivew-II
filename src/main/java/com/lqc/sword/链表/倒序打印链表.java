package com.lqc.sword.链表;

import com.lqc.sword.ListNode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author liqicong@myhexin.com
 * @date 2019/9/16 13:32
 */
public class 倒序打印链表 {
    /**
     * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
     */
    ArrayList<Integer> result=new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        if(listNode==null){
            return result;
        }
        if(listNode!=null){
            printListFromTailToHead(listNode.next);
            result.add(listNode.val);
        }
        return result;
    }
}
