package com.example.demo.api;

import com.example.demo.api.behaviors.Flyable;
import com.example.demo.api.helper.SingHelper;
import com.example.demo.api.utils.Constant;
import com.example.demo.api.utils.enums.SoundEnums;

public class Parrot extends Bird implements Flyable {
    public Parrot() {
        super(new SingHelper(SoundEnums.DEFAULT));
    }

    public Parrot(SingHelper singHelper) {
        super(singHelper);
    }

    public void canFly() {
        System.out.println(Constant.I_AM_FLYING);
    }
}
