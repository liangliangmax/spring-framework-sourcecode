package com.liang.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBootstrapApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-bean.xml");

        MyBean bean = classPathXmlApplicationContext.getBean(MyBean.class);

        System.out.println(bean);

    }
}
