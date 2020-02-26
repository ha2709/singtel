package com.example.demo.api;

import com.example.demo.api.behaviors.Flyable;
import com.example.demo.api.behaviors.Speakable;
import com.example.demo.api.behaviors.Walkable;
import com.example.demo.api.helper.SingHelper;
import com.example.demo.api.utils.Constant;

public class Insect extends Animal implements Flyable, Walkable, Speakable {
    private SingHelper singHelper;

    public Insect(SingHelper singHelper) {
        this.singHelper = singHelper;
    }

    public void canFly() {
        System.out.println(Constant.I_AM_FLYING);
    }

    public void callSound() {
        singHelper.makeSound();
    }

    public void canWalk() {
        System.out.println(Constant.I_AM_WALKING);
    }
}
