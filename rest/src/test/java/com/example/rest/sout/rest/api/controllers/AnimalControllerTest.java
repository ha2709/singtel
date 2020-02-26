package com.example.rest.sout.rest.api.controllers;

import org.junit.jupiter.api.Test;

import com.example.rest.api.Animal;
import com.example.rest.api.Bird;
import com.example.rest.api.Butterfly;
import com.example.rest.api.Cat;
import com.example.rest.api.Chicken;
import com.example.rest.api.Clownfish;
import com.example.rest.api.Dog;
import com.example.rest.api.Dolphin;
import com.example.rest.api.Duck;
import com.example.rest.api.Fish;
import com.example.rest.api.Frog;
import com.example.rest.api.Parrot;
import com.example.rest.api.Rooster;
import com.example.rest.api.Shark;
import com.example.rest.api.controllers.AnimalController;
import com.example.rest.sout.rest.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AnimalControllerTest {
    @Test
    void getFlyingAnimalCount() {
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
                new Frog(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };
        int flyingAnimalCount = new AnimalController().getFlyingAnimalCount(animals);
        assertEquals(flyingAnimalCount, 6);
    }

}