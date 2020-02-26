package com.example.rest.api;

import com.example.rest.api.behaviors.Swimmable;
import com.example.rest.api.utils.Constant;

public class Dolphin extends Animal implements Swimmable {
    public void canSwim() {
        System.out.println(Constant.I_AM_SWIMMING);
    }
}
