package com.example.rest.api;

import com.example.rest.api.behaviors.Flyable;
import com.example.rest.api.helper.SingHelper;
import com.example.rest.api.utils.Constant;
import com.example.rest.api.utils.enmus.SoundEnums;

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
