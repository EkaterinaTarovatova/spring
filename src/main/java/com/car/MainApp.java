package com.car;

import com.car.components.Car;
import com.car.config.CarConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        // --- Способ 1: Только XML ---
        System.out.println("=== DI через XML конфигурацию ===");
        ApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car1 = context1.getBean("car", Car.class);
        System.out.println(car1);
        System.out.println();

        // --- Способ 2: XML + Аннотации (@Component, @Autowired) ---
        System.out.println("=== DI через XML + Аннотации ===");
        ApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContext-annotation.xml");
        Car car2 = context2.getBean(Car.class);
        System.out.println(car2);
        System.out.println();

        // --- Способ 3: Java Configuration (@Configuration + @Bean) ---
        System.out.println("=== DI через JavaConfig ===");
        ApplicationContext context3 = new AnnotationConfigApplicationContext(CarConfig.class);
        Car car3 = context3.getBean("car", Car.class);
        System.out.println(car3);
        System.out.println();

        ((ClassPathXmlApplicationContext) context1).close();
        ((ClassPathXmlApplicationContext) context2).close();
        ((AnnotationConfigApplicationContext) context3).close();
    }
}

