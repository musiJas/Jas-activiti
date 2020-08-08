package cn.begonia.project.autoconfigure.jasactivitiautofigure.starter.util;

import sun.misc.Request;

import javax.servlet.http.HttpServletRequest;

public class HttpUtil {

    public static  String  getContextHost(HttpServletRequest  request){
        return getIpAddress(request);
    }
    public  static  String getContextPort(HttpServletRequest  request){
        return  String.valueOf(request.getRemotePort());
    }
    public  static  String  getBaseUrl(HttpServletRequest request){
        return request.getRequestURL().toString();
    }
    public  static  String  getContextPath(HttpServletRequest  request){
        return  request.getContextPath();
    }
    public static String getIpAddress(HttpServletRequest request) {
              String ip = request.getHeader("x-forwarded-for");
             if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                      ip = request.getHeader("Proxy-Client-IP");
                   }
                if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                         ip = request.getHeader("WL-Proxy-Client-IP");
                    }
                if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                         ip = request.getHeader("HTTP_CLIENT_IP");
                    }
                if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                       ip = request.getHeader("HTTP_X_FORWARDED_FOR");
                     }
                 if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                         ip = request.getRemoteAddr();
                     }
                 return ip;
             }
}
