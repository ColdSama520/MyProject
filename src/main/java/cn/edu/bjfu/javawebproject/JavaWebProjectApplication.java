package cn.edu.bjfu.javawebproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.edu.bjfu.javawebproject.mapper")
@SpringBootApplication
public class JavaWebProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaWebProjectApplication.class, args);
    }

}
