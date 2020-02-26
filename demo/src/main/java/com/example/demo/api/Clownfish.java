package com.example.demo.api;

import com.example.demo.api.utils.Constant;

public class Clownfish extends Fish {


    @Override
    public String bodySize() {
        return "small";
    }

    @Override
    public String bodyColor() {
        return "orange";
    }

    public void makeJoke() {
        System.out.println(Constant.I_MAKE_JOKES);
    }
}
