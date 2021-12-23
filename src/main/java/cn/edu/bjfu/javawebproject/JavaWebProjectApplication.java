package cn.edu.bjfu.javawebproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@MapperScan("cn.edu.bjfu.javawebproject.mapper")
@SpringBootApplication
public class JavaWebProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaWebProjectApplication.class, args);
    }

    //全局配置跨域
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                //针对某一网址 且请求路径是两级/../...
                //registry.addMapping("/*/*").allowedOrigins("http://10.252.96.120");
                //针对所有网址，且请求路径是多级/  or /../..  or /../../...
                registry.addMapping("/**").allowedOrigins("*");
                registry.addMapping("/**").allowCredentials(false);
            }
        };
    }


}
