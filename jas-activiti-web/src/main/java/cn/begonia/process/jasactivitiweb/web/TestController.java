package cn.begonia.process.jasactivitiweb.web;

import cn.begonia.project.autoconfigure.jasactivitiautofigure.starter.other.JasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  TestController {

    @Autowired
    JasService jasService;

    @GetMapping("/hello")
    public String sayHello(String name) {
        return jasService.sayHello(name);
    }



}
