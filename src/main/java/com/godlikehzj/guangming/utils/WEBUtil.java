package com.godlikehzj.guangming.utils;

import org.springframework.util.Assert;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import java.io.*;

/**
 * Created by godlikehzj on 2016/11/13.
 */
public class WEBUtil {
    public static HttpSession getSession() {
        HttpSession session = null;
        try {
            session = getRequest().getSession();
        } catch (Exception e) {
        }
        return session;
    }

    public static HttpServletRequest getRequest() {
        ServletRequestAttributes attrs = (ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes();
        return attrs.getRequest();
    }

    public static void write(HttpServletResponse response,String context){
        PrintWriter out = null;
        try {
            response.setContentType("text/html;charset=UTF-8");
            out = response.getWriter();
            out.println(context);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            out.close();
        }
    }



    public static Cookie getCookie(HttpServletRequest request, String name) {
        Assert.notNull(request);
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length > 0) {
            for (Cookie c : cookies) {
                if (c.getName().equals(name)) {
                    return c;
                }
            }
        }
        return null;
    }


    /**
     * 页面下载文件
     * @param response
     * @param file
     * @param fileName
     * @param encoding
     * @param decoding
     * @return
     */
    public static boolean download(HttpServletResponse response, File file,
                                   String fileName) {
        if(!file.exists()) return false;
        FileInputStream fis = null;
        BufferedInputStream in = null;
        OutputStream out = null;
        try{
            fis = new FileInputStream(file);
            in = new BufferedInputStream(fis);
            byte[] buf = new byte[4096];
            response.reset(); // 非常重要
//			int dotIdx;
//			if((dotIdx=fileName.lastIndexOf("."))>0){
//				String subfixName=fileName.substring(dotIdx+1);
//				if(subfixName.equalsIgnoreCase("xls")){
//					response.setContentType("application/vnd.ms-excel");
//				}else if(subfixName.equalsIgnoreCase("apk")){
//					response.setContentType("application/vnd.android.package-archive");
//				}else{
            response.setContentType("application/x-msdownload");
//				}
//			}
            response.setHeader("Content-Disposition", "attachment; filename=" + fileName);
            out = response.getOutputStream();
            int len = 0;
            while ((len = in.read(buf)) > 0){
                out.write(buf, 0, len);
            }
            out.flush();
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }finally{
            try {
                if(null != in) in.close();
                if(null != out) out.close();
                if(null != fis) fis.close();
            } catch (IOException e){}
        }
        return true;
    }



}
