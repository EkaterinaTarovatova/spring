package com.car.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Engine {
    @Autowired
    private Starter starter;
    @Autowired
    private SparkPlug sparkPlug;

    public Starter getStarter() {
        return starter;
    }

    public void setStarter(Starter starter) {
        this.starter = starter;
    }

    public SparkPlug getSparkPlug() {
        return sparkPlug;
    }

    public void setSparkPlug(SparkPlug sparkPlug) {
        this.sparkPlug = sparkPlug;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "starter=" + starter +
                ", sparkPlug=" + sparkPlug +
                '}';
    }
}
