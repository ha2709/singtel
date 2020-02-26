package com.example.demo.api;

import com.example.demo.api.helper.SingHelper;
import com.example.demo.api.utils.enums.SoundEnums;

public class Dog extends Mammal {
    public Dog() {
        super((new SingHelper(SoundEnums.DOG)));
    }

    public Dog(SingHelper singHelper) {
        super(singHelper);
    }
}
