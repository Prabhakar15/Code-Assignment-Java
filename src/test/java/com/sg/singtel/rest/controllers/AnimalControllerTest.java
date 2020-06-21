package com.sg.singtel.rest.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sg.singtel.rest.controller.AnimalController;

class AnimalControllerTest {
    @Test
    void getFlyingAnimalCount() {
    	
        String animals = "Cat,Dog,Fish,Duck,Bird,Chicken,Rooster,Parrot";
        String flyingAnimalCount = new AnimalController().getFlyingAnimalCount(animals);
        assertEquals(flyingAnimalCount, 6);
    }

}