package org.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author WongFaaCoi
 * @project GitTest
 * @user 黄花菜
 * @date 2022年12月10日 23:04:18
 */
@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
public class Starter {
    public static void main(String[] args) {
        SpringApplication.run(Starter.class);
    }
}
