package cn.begonia.project.autoconfigure.jasactivitiautofigure.starter.controller;

import cn.begonia.project.autoconfigure.jasactivitiautofigure.starter.other.JasProperties;
import cn.begonia.project.autoconfigure.jasactivitiautofigure.starter.util.JasContextAwareUtil;
import lombok.extern.slf4j.Slf4j;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HealthController {

    private JasProperties  jasProperties;

    public void setJasProperties(JasProperties jasProperties) {
        this.jasProperties = jasProperties;
    }

    @Autowired
    private RepositoryService repositoryService;
    @Autowired
    private TaskService   taskService;

    @RequestMapping("/isOk")
    public  String  isOk(){
        JasContextAwareUtil.showBeanConsole();
        if(repositoryService!=null){
            System.out.println(repositoryService.getModel("1"));
        }
        if(taskService!=null){
            System.out.println(taskService.createTaskQuery().taskCandidateOrAssigned("jas"));
        }
        log.info(" load controller  by  jas -activiti -autofigure....");
        return "isOk";
    }

    @RequestMapping("/console")
    public  String   console(){
        StringBuffer  sb=new StringBuffer();
        return  jasProperties.toString();
    }

}
