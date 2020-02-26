package com.example.demo.api;

import com.example.demo.api.helper.SingHelper;
import com.example.demo.api.utils.enums.SoundEnums;

public class Cat extends Mammal {
    public Cat() {
        super(new SingHelper(SoundEnums.CAT));
    }

    public Cat(SingHelper singHelper) {
        super(singHelper);
    }
}
