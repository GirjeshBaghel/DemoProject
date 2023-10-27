package com;

import com.controller.JenkinsClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoProjectApplication.class, args);
        JenkinsClass ob = new JenkinsClass();
        ob.demo();
        System.out.println("Demo Project Is Running");
        System.out.println("Jenkins Class is Running 5");
        System.out.println("Jenkins Class is Running 6");


    }

}
