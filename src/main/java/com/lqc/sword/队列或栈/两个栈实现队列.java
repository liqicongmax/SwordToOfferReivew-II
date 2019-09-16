package com.lqc.sword.队列或栈;

import java.util.Stack;

/**
 * @author liqicong@myhexin.com
 * @date 2019/9/16 14:29
 */
public class 两个栈实现队列 {
    /**
     * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
     */
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack1.isEmpty()&&stack2.isEmpty()){
            return -1;
        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }


}
