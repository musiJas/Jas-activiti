package cn.begonia.project.autoconfigure.jasactivitiautofigure.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "begonia.starter")
public class JasProperties {

    private String suffix;

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

}
