package com.example.demo.api.helper;

import com.example.demo.api.utils.enums.SoundEnums;

public class SingHelper {
    private SoundEnums soundEnums;

    public SingHelper(SoundEnums soundEnums) {
        this.soundEnums = soundEnums;
    }

    public void makeSound() {
        System.out.println(soundEnums.getSound());
    }
}
