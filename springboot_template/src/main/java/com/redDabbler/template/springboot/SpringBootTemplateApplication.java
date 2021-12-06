package com.redDabbler.template.springboot;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;

/**
 * 自动配置的类参考spring.factories文件
 * 约定 自动扫描地址
 */
@SpringBootApplication(exclude = {RabbitAutoConfiguration.class})
@MapperScan("com.redDabbler.template.springboot.mapper")
public class SpringBootTemplateApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootTemplateApplication.class,args);
    }
}
