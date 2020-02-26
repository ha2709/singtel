package com.example.demo.api;

import com.example.demo.api.behaviors.Speakable;
import com.example.demo.api.behaviors.Swimmable;
import com.example.demo.api.behaviors.Walkable;
import com.example.demo.api.helper.SingHelper;
import com.example.demo.api.utils.Constant;
import com.example.demo.api.utils.enums.SoundEnums;

public class Frog extends Animal implements Swimmable, Walkable, Speakable {
    SingHelper singHelper;

    public Frog() {
        singHelper = new SingHelper(SoundEnums.DEFAULT);
    }

    public Frog(SingHelper singHelper) {
        singHelper = singHelper;
    }

    public void callSound() {
        singHelper.makeSound();
    }

    public void canSwim() {
        System.out.println(Constant.I_AM_SWIMMING);
    }

    public void canWalk() {
        System.out.println(Constant.I_AM_WALKING);
    }
}
