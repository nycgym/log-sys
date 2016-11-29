package cn.yunyichina.log.service.collectorNode;

import cn.yunyichina.log.service.collectorNode.util.SpringContextUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2016/11/24 10:45
 * @Description:
 */
@EnableWebMvc
@SpringBootApplication(scanBasePackages = "cn.yunyichina.log.service.collectorNode")
@MapperScan(basePackages = "cn.yunyichina.log.service.collectorNode.mapper")
@EnableEurekaClient
public class Bootstrap{
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Bootstrap.class, args);
        SpringContextUtil.setApplicationContext(applicationContext);
    }
}
