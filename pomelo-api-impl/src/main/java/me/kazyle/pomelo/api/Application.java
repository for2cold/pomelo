package me.kazyle.pomelo.api;

import me.kazyle.pomelo.support.annotation.MyBatisMapper;
import me.kazyle.pomelo.support.config.KazyleProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.concurrent.CountDownLatch;

/**
 * <p>pomelo</p>
 * <p>
 * <b>Application</b> is 接口服务启动类
 * </p>
 *
 * @version 1.0
 * @since 1.0
 * Created by Kazyle on 2016/10/26 15:49
 */
@SpringBootApplication(scanBasePackages = {"me.kazyle.pomelo"})
@EnableConfigurationProperties({KazyleProperties.class})
@EnableTransactionManagement
@MapperScan(value = "me.kazyle.pomelo.mapper", annotationClass = MyBatisMapper.class)
@ImportResource("classpath*:META-INF/spring/dubbo-api-provider.xml")
public class Application {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Application.class, args);
    }
}
