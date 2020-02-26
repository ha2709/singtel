package com.example.rest.api.helper;

import com.example.rest.api.utils.enmus.SoundEnums;

public class SingHelper {
    private SoundEnums soundEnums;

    public SingHelper(SoundEnums soundEnums) {
        this.soundEnums = soundEnums;
    }

    public void makeSound() {
        System.out.println(soundEnums.getSound());
    }
}
