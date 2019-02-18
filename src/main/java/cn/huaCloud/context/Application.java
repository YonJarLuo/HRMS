package cn.huaCloud.context;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by LuoYJ on 2019/2/14.
 * 人力资源管理系统
 */
@SpringBootApplication
@MapperScan("cn.huaCloud.dao")
@ComponentScan("cn.huaCloud.**")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
