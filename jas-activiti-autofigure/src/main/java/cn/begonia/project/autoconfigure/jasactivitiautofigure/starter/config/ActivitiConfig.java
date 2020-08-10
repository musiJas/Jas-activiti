package cn.begonia.project.autoconfigure.jasactivitiautofigure.starter.config;

import cn.begonia.project.autoconfigure.jasactivitiautofigure.starter.controller.HealthController;
import cn.begonia.project.autoconfigure.jasactivitiautofigure.starter.controller.ModelerController;
import cn.begonia.project.autoconfigure.jasactivitiautofigure.starter.controller.editor.ModelEditorJsonRestResource;
import cn.begonia.project.autoconfigure.jasactivitiautofigure.starter.controller.editor.ModelSaveRestResource;
import cn.begonia.project.autoconfigure.jasactivitiautofigure.starter.controller.editor.StencilsetRestResource;
import cn.begonia.project.autoconfigure.jasactivitiautofigure.starter.other.JasProperties;
import cn.begonia.project.autoconfigure.jasactivitiautofigure.starter.other.JasService;
import cn.begonia.project.autoconfigure.jasactivitiautofigure.starter.util.JasContextAwareUtil;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.impl.history.HistoryLevel;
import org.activiti.spring.SpringProcessEngineConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import javax.sql.DataSource;

/**
 */
@SuppressWarnings("all")
@ConditionalOnWebApplication
@EnableConfigurationProperties(JasProperties.class)
@Configuration
public class ActivitiConfig {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private PlatformTransactionManager transactionManager;
    @Autowired
    private JasProperties jasProperties;
    /**
     * 初始化配置
     *
     * @return
     */
    @Bean
    public SpringProcessEngineConfiguration processEngineConfiguration() {
        SpringProcessEngineConfiguration configuration = new SpringProcessEngineConfiguration();
        // 执行工作流对应的数据源
        configuration.setDataSource(dataSource);
        // 是否自动创建流程引擎表
        configuration.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
        configuration.setAsyncExecutorActivate(false);
        // 流程历史等级
        configuration.setHistoryLevel(HistoryLevel.FULL);
        // 流程图字体
        configuration.setActivityFontName("宋体");
        configuration.setAnnotationFontName("宋体");
        configuration.setLabelFontName("宋体");
        configuration.setTransactionManager(transactionManager);
        return configuration;
    }
    @Bean
    public JasContextAwareUtil  initialContextAware(){
        return  new JasContextAwareUtil();
    }

    @Bean
    public HealthController initialHealthController(){
        HealthController  health=new HealthController();
        health.setJasProperties(jasProperties);
        return  health;
    }
    @Bean
    public ModelerController initialModelerController(){
        return  new ModelerController();
    }
    @Bean
    public ModelSaveRestResource  initialModelProcessController(){
        return  new ModelSaveRestResource();
    }
    @Bean
    public ModelEditorJsonRestResource  initialModelEditorProcessController(){
        return  new ModelEditorJsonRestResource();
    }
    @Bean
    public StencilsetRestResource  initialStencilProcessController(){
        return  new StencilsetRestResource();
    }
}
