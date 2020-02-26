package com.example.rest.api;

import com.example.rest.api.behaviors.Flyable;
import com.example.rest.api.behaviors.Swimmable;
import com.example.rest.api.helper.SingHelper;
import com.example.rest.api.utils.Constant;
import com.example.rest.api.utils.enmus.SoundEnums;

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
