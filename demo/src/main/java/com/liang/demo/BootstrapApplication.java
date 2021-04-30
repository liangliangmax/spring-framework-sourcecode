package com.liang.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
public class BootstrapApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(BootstrapApplication.class);
        UserService bean = annotationConfigApplicationContext.getBean(UserService.class);

        System.out.println(bean);

    }
}
