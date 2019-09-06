package cn.xtrui.mbp.temp;

import cn.xtrui.mbp.bean.Book;
import org.apache.velocity.runtime.directive.Parse;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TimeTest implements Hehe{
    @Override
    public String p(){
        System.out.println("222");
        return "22";
    }


    public  static void testTime()  {
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("当前时间"+currentTime);
        LocalDate localDate = currentTime.toLocalDate();
        System.out.println("localDAte"+localDate);
        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int hour = currentTime.getHour();
        System.out.println("mouth:"+month.getValue()+" day:"+day+" hour"+hour);
//        HashMap<Object, Object> map = new HashMap<>();
        LocalTime t1 = LocalTime.of(23,11);
        System.out.println("t1"+t1);

        LocalTime parase = LocalTime.parse("07:45:23");
        System.out.println("parse"+ parase);

        LocalDate date = LocalDate.parse("2020-09-12");
        System.out.println(date);
        LocalDateTime dateTime = LocalDateTime.parse("2019-09-23T08:20:32");
        System.out.println(dateTime);

        try {
            String st = new String("中文吧".getBytes(StandardCharsets.UTF_8),"GBK");
            System.out.println(st);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }




    }

}
