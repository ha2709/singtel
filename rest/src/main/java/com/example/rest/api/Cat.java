package com.example.rest.api;

import com.example.rest.api.helper.SingHelper;
import com.example.rest.api.utils.enmus.SoundEnums;

public class Cat extends Mammal {
    public Cat() {
        super(new SingHelper(SoundEnums.CAT));
    }

    public Cat(SingHelper singHelper) {
        super(singHelper);
    }
}
