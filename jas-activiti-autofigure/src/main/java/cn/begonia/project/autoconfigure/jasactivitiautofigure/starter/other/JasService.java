package cn.begonia.project.autoconfigure.jasactivitiautofigure.starter.other;

public class JasService {
    JasProperties jasProperties;

    public String sayHello(String name) {
        return "Hello " + name + "，" + jasProperties.getSuffix();
    }

    public JasProperties getJasProperties() {
        return jasProperties;
    }

    public void setJasProperties(JasProperties jasProperties) {
        this.jasProperties = jasProperties;
    }


}
