package com.godlikehzj.guangming.utils;

/**
 * Created by zhijunhu on 2016/10/27.
 */
public class Counter {
    public volatile static int count = 0;

    public static void inc() {
        count++;
        //这里延迟1毫秒，使得结果明显
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }


    }

    public static void main(String[] args) {

        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        System.out.println(c==d);
        System.out.println(e==f);
        System.out.println(c==(a+b));
        System.out.println(c.equals(a+b));
        System.out.println(g==(a+b));
        System.out.println(g.equals(a+b));

    }
}
