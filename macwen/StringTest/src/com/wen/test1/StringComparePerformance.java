package com.wen.test1;

/**
 * @Description:字符串创建效率比较
 * @Author 文博  88448045
 * @Date 2019/7/25 14:06
 */
public class StringComparePerformance {
    public static void main(String[] args) {
        long startTine=System.currentTimeMillis();
        for (int i=0;i<5000;i++){
            String s1="This is a String";
            String s2="This is a String";
        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTine);

        System.out.println("---------------------------");
        long startTime1=System.currentTimeMillis();
        for (int i=0;i<50000;i++){
            String s3=new String("This is a String");
            String s4=new String("This is a String");
        }
        long endTime1=System.currentTimeMillis();
        System.out.println(endTime1-startTime1);
    }
}
