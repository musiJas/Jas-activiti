package cn.begonia.process.jasactivitiweb.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//@Controller
public class IndexController {

    @RequestMapping("/")
    public   String  index(){
        System.out.println("forward...index");
        return  "index";
    }
    @RequestMapping("/index")
    public   String  forwardIndex(){
        System.out.println("forward...index");
        return  "index";
    }


}
