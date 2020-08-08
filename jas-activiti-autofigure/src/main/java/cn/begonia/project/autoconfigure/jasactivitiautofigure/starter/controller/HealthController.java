package cn.begonia.project.autoconfigure.jasactivitiautofigure.starter.controller;

import cn.begonia.project.autoconfigure.jasactivitiautofigure.starter.other.JasProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HealthController {

    private JasProperties  jasProperties;

    public JasProperties getJasProperties() {
        return jasProperties;
    }

    public void setJasProperties(JasProperties jasProperties) {
        this.jasProperties = jasProperties;
    }

    @RequestMapping("/isOk")
    public  String  isOk(){
        log.info(" load controller  by  jas -activiti -autofigure....");
        return "isOk";
    }

    @RequestMapping("/console")
    public  String   console(){
        StringBuffer  sb=new StringBuffer();
        return  jasProperties.toString();
    }

}
