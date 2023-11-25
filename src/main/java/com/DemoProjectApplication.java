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
        System.out.println("Hello i am Aniket");
        System.out.println("Hello i am Aniket 2");
        System.out.println("Hello i am Girjesh");
        System.out.println("Hello i am Jenkins");



    }

}
