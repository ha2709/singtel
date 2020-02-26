package com.example.demo.api;

import com.example.demo.api.behaviors.Speakable;
import com.example.demo.api.behaviors.Walkable;
import com.example.demo.api.helper.SingHelper;
import com.example.demo.api.utils.Constant;
import com.example.demo.api.utils.enums.SoundEnums;

public abstract class Mammal extends Animal implements Walkable, Speakable {
    private SingHelper singHelper;

    public Mammal() {
        this.singHelper = new SingHelper(SoundEnums.DEFAULT);
    }

    public Mammal(SingHelper singHelper) {
        this.singHelper = singHelper;
    }

    public void callSound() {
        singHelper.makeSound();
    }

    public void canWalk() {
        System.out.println(Constant.I_AM_WALKING);
    }
}
