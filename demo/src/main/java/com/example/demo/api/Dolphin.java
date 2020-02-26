package com.example.demo.api;

import com.example.demo.api.behaviors.Swimmable;
import com.example.demo.api.utils.Constant;

public class Dolphin extends Animal implements Swimmable {
    public void canSwim() {
        System.out.println(Constant.I_AM_SWIMMING);
    }
}
