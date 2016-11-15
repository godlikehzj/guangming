package com.godlikehzj.guangming.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhijunhu on 2016/11/15.
 */
public class SysApiStatus {
    public static Map<Integer,String> message=new HashMap<Integer, String>();;

    public static final Integer OK = 0; //业务正常
    public static final Integer OK_200 = 200; //业务正常
    public static final Integer ERROR = 500; //ERROR
    public static final Integer SYSTEMERROR = 50000; //系统错误

    static {
        message.put(OK, "ok");
        message.put(OK_200, "ok");
        message.put(ERROR, "ERROR");
        message.put(SYSTEMERROR, "系统错误");
    }

    public static String getMessage(Integer key) {
        return message.get(key);
    }
}
