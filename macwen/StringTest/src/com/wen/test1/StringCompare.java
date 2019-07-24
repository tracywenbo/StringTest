package com.wen.test1;

/**
 * @Description:字符串的比较
 * @Author 文博  88448045
 * @Date 2019/7/23 17:30
 */
public class StringCompare {
    public static void main(String[] args) {
        /*String str="Tracy mac";
        String str1="tracy mac";
        Object object=str;
        System.out.println(str.compareTo(str1));
        System.out.println(str.compareToIgnoreCase(str1));
        System.out.println(str.compareToIgnoreCase(object.toString()));*/

       /* String s1="mac";
        String s2="mac";
        String s3=new String("mac");
        String s4=new String("Mac");

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));*/

        String s1="mac";
        String s2="mac";
        String s3=new String("mac");
        String s4=new String("Mac");

        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s3==s4);




    }
}
