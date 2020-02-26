package com.example.demo.api;

import com.example.demo.api.behaviors.Flyable;
import com.example.demo.api.behaviors.Swimmable;
import com.example.demo.api.helper.SingHelper;
import com.example.demo.api.utils.Constant;
import com.example.demo.api.utils.enums.SoundEnums;

public class Duck extends Bird implements Swimmable, Flyable {

    public Duck() {
        super(new SingHelper(SoundEnums.DUCK));
    }

    @Override
    public void canWalk() {
        super.canWalk();
    }

    public void canFly() {
        System.out.println(Constant.I_AM_FLYING);
    }

    public void canSwim() {
        System.out.println(Constant.I_AM_SWIMMING);
    }
}
