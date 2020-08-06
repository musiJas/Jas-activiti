package cn.begonia.project.autoconfigure.jasactivitiautofigure.starter;
/**
 * web应用才生效
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 让属性文件生效
 */

/***
 * 声明是一个配置类
 */
@ConditionalOnWebApplication
@EnableConfigurationProperties(JasProperties.class)
@Configuration
public class JasServiceAutoConfigure {

    @Autowired
    private JasProperties jasProperties;

    @Bean
    public JasService helloService() {
        JasService  jasService = new JasService();
        jasService.setJasProperties(jasProperties);
        return jasService;
    }
}
