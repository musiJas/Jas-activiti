package cn.begonia.project.autoconfigure.jasactivitiautofigure.starter.config;

import cn.begonia.project.autoconfigure.jasactivitiautofigure.starter.interceptor.DataChainInterceptor;
import cn.begonia.project.autoconfigure.jasactivitiautofigure.starter.other.JasProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 */
@ConditionalOnWebApplication
@EnableConfigurationProperties(JasProperties.class)
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {
    @Autowired
    private JasProperties jasProperties;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
        super.addResourceHandlers(registry);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/index");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(handlerInterceptor())
                  //配置拦截规则
                .addPathPatterns("/**");
        //super.addInterceptors(registry);
    }

    @Bean
    public DataChainInterceptor   handlerInterceptor(){
        DataChainInterceptor dc= new DataChainInterceptor();
        dc.setJasProperties(jasProperties);
        return dc;
    }

}