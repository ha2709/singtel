package com.example.rest.api;

import com.example.rest.api.behaviors.BodyType;
import com.example.rest.api.behaviors.Swimmable;
import com.example.rest.api.utils.Constant;

public class Fish extends Animal implements Swimmable, BodyType {
    public void canSwim() {
        System.out.println(Constant.I_AM_SWIMMING);
    }

    public String bodySize() {
        return null;
    }

    public String bodyColor() {
        return null;
    }
}
