package com.example.demo.api;

import com.example.demo.api.behaviors.NotFlyable;
import com.example.demo.api.helper.SingHelper;
import com.example.demo.api.utils.Constant;
import com.example.demo.api.utils.enums.SoundEnums;

public class Chicken extends Bird implements NotFlyable {
    public Chicken() {
        super(new SingHelper(SoundEnums.CHICKEN));
    }

    public Chicken(SingHelper singHelper) {
        super(singHelper);
    }

    @Override
    public void canWalk() {
        super.canWalk();
    }

    @Override
    public void canFly() {
        System.out.println(Constant.I_CANT_FLY);
    }
}
