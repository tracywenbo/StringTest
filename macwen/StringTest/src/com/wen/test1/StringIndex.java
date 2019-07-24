package com.wen.test1;

/**
 * @Description:特定字符或者字符串出现的位置
 * @Author 文博  88448045
 * @Date 2019/7/23 17:47
 */
public class StringIndex {
    public static void main(String[] args) {
        String str="Hello Tracy MacGrady";
        int index=str.lastIndexOf("y");
        int index1=str.indexOf("y");
        System.out.println(index);
        System.out.println(index1);
    }
}
