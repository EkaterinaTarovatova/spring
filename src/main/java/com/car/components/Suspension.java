package com.car.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Suspension {
    @Autowired
    private Hinge hinge;
    @Autowired
    private Differential differential;

    public Hinge getHinge() {
        return hinge;
    }

    public void setHinge(Hinge hinge) {
        this.hinge = hinge;
    }

    public Differential getDifferential() {
        return differential;
    }

    public void setDifferential(Differential differential) {
        this.differential = differential;
    }

    @Override
    public String toString() {
        return "Suspension{" +
                "hinge=" + hinge +
                ", differential=" + differential +
                '}';
    }
}
