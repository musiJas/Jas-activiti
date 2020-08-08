package cn.begonia.project.autoconfigure.jasactivitiautofigure.starter.other;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "begonia.starter")
public class JasProperties {

    private String suffix;
    private String contextPath;

    @Override
    public String toString() {
        return "JasProperties{" +
                "suffix='" + suffix + '\'' +
                ", contextPath='" + contextPath + '\'' +
                '}';
    }
}
