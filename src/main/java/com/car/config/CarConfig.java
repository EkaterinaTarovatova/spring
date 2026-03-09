package com.car.config;

import com.car.components.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.car.components")
public class CarConfig {

    @Bean
    public Wheel wheel() {
        Wheel wheel = new Wheel();
        wheel.setBrand("Pirelli");
        return wheel;
    }

    @Bean
    public Starter starter() {
        return new Starter();
    }

    @Bean
    public SparkPlug sparkPlug() {
        return new SparkPlug();
    }

    @Bean
    public Engine engine() {
        Engine engine = new Engine();
        engine.setStarter(starter());
        engine.setSparkPlug(sparkPlug());
        return engine;
    }

    @Bean
    public Accumulator accumulator() {
        return new Accumulator();
    }

    @Bean
    public Hinge hinge() {
        return new Hinge();
    }

    @Bean
    public Differential differential() {
        return new Differential();
    }

    @Bean
    public Suspension suspension() {
        Suspension suspension = new Suspension();
        suspension.setHinge(hinge());
        suspension.setDifferential(differential());
        return suspension;
    }

    @Bean
    public Car car() {
        Car car = new Car();
        car.setWheel(wheel());
        car.setEngine(engine());
        car.setAccumulator(accumulator());
        car.setSuspension(suspension());
        return car;
    }
}
