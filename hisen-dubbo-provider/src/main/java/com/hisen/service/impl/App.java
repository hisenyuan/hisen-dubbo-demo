package com.hisen.service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/spring-dubbo-provider.xml"});
        context.start();
        System.out.println("press any key to exit.");
        System.in.read();
    }
}
