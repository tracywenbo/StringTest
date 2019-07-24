package com.wen.test1;

/**
 * @Description:删除特定位置的字符
 * @Author 文博  88448045
 * @Date 2019/7/23 17:53
 */
public class StringDelete {
    public static void main(String[] args) {
        String str="Tracy MacGrady sposrts";
        System.out.println(removeChar(str,21));

    }

    public static String removeChar(String str,int i){
        return str.substring(0, i) + str.substring(i + 1);
    }
}
