package cn.begonia.project.autoconfigure.jasactivitiautofigure.starter.interceptor;

import cn.begonia.project.autoconfigure.jasactivitiautofigure.starter.other.JasProperties;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Data
@Slf4j
public class DataChainInterceptor implements HandlerInterceptor {
    private JasProperties  jasProperties;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        log.info("preHandler....");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

        /** 此处追加web 的基本常用信息，**/
        if(modelAndView!=null){
            modelAndView.addObject("contextPath",jasProperties.getContextPath());
        }
        log.info("postHandler....");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

        log.info("afterHandler....");
    }
}
