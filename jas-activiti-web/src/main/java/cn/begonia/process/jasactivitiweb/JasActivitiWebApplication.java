package cn.begonia.process.jasactivitiweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class,
        org.activiti.spring.boot.SecurityAutoConfiguration.class})
public class JasActivitiWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(JasActivitiWebApplication.class, args);
    }

}
