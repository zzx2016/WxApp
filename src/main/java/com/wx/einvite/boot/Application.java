package com.wx.einvite.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by lx on 2017/6/6.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.wx.einvite")
public class Application {

    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }
}
