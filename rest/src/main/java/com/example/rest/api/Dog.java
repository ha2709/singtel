package com.example.rest.api;

import com.example.rest.api.helper.SingHelper;
import com.example.rest.api.utils.enmus.SoundEnums;

public class Dog extends Mammal {
    public Dog() {
        super((new SingHelper(SoundEnums.DOG)));
    }

    public Dog(SingHelper singHelper) {
        super(singHelper);
    }
}
