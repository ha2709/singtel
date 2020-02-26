package com.example.demo.api;

import com.example.demo.api.behaviors.Flyable;
import com.example.demo.api.behaviors.NotFlyable;
import com.example.demo.api.behaviors.NotSpeakable;
import com.example.demo.api.behaviors.Speakable;
import com.example.demo.api.helper.SingHelper;
import com.example.demo.api.utils.Constant;
import com.example.demo.api.utils.enums.SoundEnums;

public class Butterfly extends Insect {
    private Insect state = new caterpillarState(new SingHelper(SoundEnums.CATERPILLAR));

    public Butterfly() {
        super(new SingHelper(SoundEnums.CATERPILLAR));
    }

    public void transform() {
        state = new ButterflyState(new SingHelper(SoundEnums.NO_SOUND));
    }

    @Override
    public void canFly() {
        state.canFly();
    }

    @Override
    public void callSound() {
        state.callSound();
    }

    @Override
    public void canWalk() {
        state.canWalk();
    }

    private class ButterflyState extends Insect implements Flyable, NotSpeakable {

        public ButterflyState(SingHelper singHelper) {
            super(singHelper);
        }

        @Override
        public void callSound() {
            super.callSound();
        }

        @Override
        public void canFly() {
            super.canFly();
        }
    }

    private class caterpillarState extends Insect implements Speakable, NotFlyable {

        public caterpillarState(SingHelper singHelper) {
            super(singHelper);

        }

        @Override
        public void callSound() {
            super.callSound();
        }

        @Override
        public void canFly() {
            System.out.println(Constant.I_CANT_FLY);
        }
    }
}
