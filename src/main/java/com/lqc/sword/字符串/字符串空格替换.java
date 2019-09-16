package com.lqc.sword.字符串;

/**
 * @author liqicong@myhexin.com
 * @date 2019/9/16 13:30
 */
public class 字符串空格替换 {
    /**
     * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
     */
    public String replaceStr(StringBuffer str){
        return str.toString().replaceAll(" ","%20");
    }
}
