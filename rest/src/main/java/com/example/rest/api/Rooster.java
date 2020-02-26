package com.example.rest.api;

import com.example.rest.api.helper.LanguageHelper;
import com.example.rest.api.helper.SingHelper;
import com.example.rest.api.utils.enmus.LanguageEnums;
import com.example.rest.api.utils.enmus.SoundEnums;

public class Rooster extends Chicken {
    LanguageHelper languageHelper;
    SingHelper singHelper;
    LanguageEnums languageEnums;

    public Rooster() {
        this.singHelper = new SingHelper(SoundEnums.ROOSTER);
    }

    public Rooster(LanguageEnums languageEnums) {
        this.singHelper = new SingHelper(SoundEnums.ROOSTER);
        this.languageEnums = languageEnums;
    }

    @Override
    public void canFly() {
        super.canFly();
    }

    @Override
    public void callSound() {
        String translate = LanguageHelper.translate(SoundEnums.ROOSTER.getSound(), languageEnums);
        System.out.println(translate);

    }
}
