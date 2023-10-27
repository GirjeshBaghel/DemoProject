package com;

import com.controller.JenkinsAnotherClass;
import com.controller.JenkinsClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoProjectApplication.class, args);
        JenkinsClass ob = new JenkinsClass();
        ob.demo();
        JenkinsAnotherClass ob1 = new JenkinsAnotherClass();
        ob1.temp();
        System.out.println("Demo Project Is Running");
        System.out.println("Jenkins Class is Running 5");
        System.out.println("Jenkins Class is Running 6");
        System.out.println("Demo  Class is Running 7");
        System.out.println("Demo  Class is Running 8");
        System.out.println("Demo  Class is Running 9");



    }

}
