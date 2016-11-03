package me.kazyle.pomelo.api;

import me.kazyle.pomelo.support.annotation.MyBatisMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

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
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(value = "me.kazyle.pomelo.mapper", annotationClass = MyBatisMapper.class)
@ImportResource("classpath*:META-INF/spring/dubbo-api-provider.xml")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
