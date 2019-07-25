package com.wen.test1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description:格式化时间
 * @Author 文博  88448045
 * @Date 2019/7/25 14:30
 */
public class DateTimeFormat {
    public static void main(String[] args) {
        Date date=new Date();
        String str="HH:mm:ss: a";
        SimpleDateFormat sdf=new SimpleDateFormat(str);
        System.out.println(sdf.format(date));
    }

}
