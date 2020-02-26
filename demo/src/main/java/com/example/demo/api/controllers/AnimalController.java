package com.example.demo.api.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.api.Animal;
import com.example.demo.api.miscellaneous.AnimalCount;

@Controller
public class AnimalController {
    @RequestMapping(method = RequestMethod.GET, value = "/animal/getFlyingAnimalCount")
    @ResponseBody
    public int getFlyingAnimalCount(@RequestBody Animal[] animals) {
        AnimalCount animalCount = new AnimalCount(animals);
        System.out.println("Chay cai nay roi ");
        int flyingAnimal = animalCount.getFlyingAnimal();
        return flyingAnimal;
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
}
