package com.wen.test1;

/**
 * @Description:拆分字符串
 * @Author 文博  88448045
 * @Date 2019/7/25 11:51
 */
public class StringSplit {
    public static void main(String[] args) {
        String [] temp;
        String [] temp2;
        String str="this-is-my-dog";
        String rule="-";
        temp=str.split(rule);
        for (int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }

        System.out.println("-----------------------------------------");

        str="this.is.my.home";
        //转义字符
        rule="\\.";
        temp2=str.split(rule);
        for (int i=0;i<temp2.length;i++){
            System.out.println(temp2[i]);
        }

    }
}
