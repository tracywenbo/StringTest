package com.wen.test1;

/**
 * @Description:字符串的反转
 * @Author 文博  88448045
 * @Date 2019/7/25 11:43
 */
public class StringResver {
    public static void main(String[] args) {
        String str="lebron james";
        String str1=new StringBuffer(str).reverse().toString();
        System.out.println(str1);
    }
}
