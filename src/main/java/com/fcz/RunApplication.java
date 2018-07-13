package com.fcz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;


/**
 * @author FangChunZao
 * @Description:
 * @date 2018/7/6
 */
@SpringBootApplication
@EnableJms
public class RunApplication {

    public static void main(String[] args) {
        SpringApplication.run(RunApplication.class);
    }

}
