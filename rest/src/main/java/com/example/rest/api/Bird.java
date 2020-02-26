package com.example.rest.api;

import com.example.rest.api.behaviors.Flyable;
import com.example.rest.api.behaviors.Speakable;
import com.example.rest.api.behaviors.Walkable;
import com.example.rest.api.helper.SingHelper;
import com.example.rest.api.utils.Constant;
import com.example.rest.api.utils.enmus.SoundEnums;

public class Bird extends Animal implements Walkable, Speakable, Flyable {

    private SingHelper singHelper;

    public Bird() {
        this.singHelper = new SingHelper(SoundEnums.DEFAULT);
    }

    public Bird(SingHelper singHelper) {
        this.singHelper = singHelper;
    }

    public void callSound() {
        singHelper.makeSound();
    }

    public void canWalk() {
        System.out.println(Constant.I_AM_WALKING);
    }


    public void canFly() {
        System.out.println(Constant.I_AM_FLYING);
    }
}
