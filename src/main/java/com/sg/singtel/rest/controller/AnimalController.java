package com.sg.singtel.rest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sg.singtel.rest.behaviour.Animal;
import com.sg.singtel.rest.behaviour.Bird;
import com.sg.singtel.rest.behaviour.Butterfly;
import com.sg.singtel.rest.behaviour.Cat;
import com.sg.singtel.rest.behaviour.Chicken;
import com.sg.singtel.rest.behaviour.Clownfish;
import com.sg.singtel.rest.behaviour.Dog;
import com.sg.singtel.rest.behaviour.Dolphin;
import com.sg.singtel.rest.behaviour.Duck;
import com.sg.singtel.rest.behaviour.Fish;
import com.sg.singtel.rest.behaviour.Frog;
import com.sg.singtel.rest.behaviour.Parrot;
import com.sg.singtel.rest.behaviour.Rooster;
import com.sg.singtel.rest.behaviour.Shark;
import com.sg.singtel.rest.miscellaneous.AnimalCount;

@RestController
@RequestMapping("/animal")
public class AnimalController {
	
    @GetMapping("/getFlyingAnimal")
    public String getFlyingAnimalCount(@RequestParam("animalNames") String animalNames) {
    	
    	Animal[] animals = createAnimalObject(animalNames);    	
        AnimalCount animalCount = new AnimalCount(animals);
        int flyingAnimals = animalCount.getFlyingAnimal();
        return "Given Animals Are ::: ["+ animalNames + "]   "+ "Flying Animals Count is :::"+ String.valueOf(flyingAnimals);
    }
    
    @GetMapping("/getWalkingAnimal")
    public String getWalkingAnimalCount(@RequestParam("animalNames") String animalNames) {
    	
    	Animal[] animals = createAnimalObject(animalNames);    	
        AnimalCount animalCount = new AnimalCount(animals);
        int walkingAnimals = animalCount.getWalkingAnimal();
        return "Given Animals Are ::: ["+ animalNames + "]   "+ "Walking Animals Count is :::"+ String.valueOf(walkingAnimals);
    }
    
    @GetMapping("/getSpeakingAnimal")
    public String getSpeakingAnimalCount(@RequestParam("animalNames") String animalNames) {
    	
    	Animal[] animals = createAnimalObject(animalNames);    	
        AnimalCount animalCount = new AnimalCount(animals);
        int speakingAnimals = animalCount.getSpeakingAnimal();
        return "Given Animals Are ::: ["+ animalNames + "]   "+ "Speaking Animals Count is :::"+ String.valueOf(speakingAnimals);
    }
    
    @GetMapping("/getSwimingAnimal")
    public String getSwimingAnimalCount(@RequestParam("animalNames") String animalNames) {
    	
    	Animal[] animals = createAnimalObject(animalNames);    	
        AnimalCount animalCount = new AnimalCount(animals);
        int swimmingAnimals = animalCount.getSwimingAnimal();
        return "Given Animals Are ::: ["+ animalNames + "]   "+ "Swiming Animals Count is :::"+ String.valueOf(swimmingAnimals);
    }    
    
    public Animal[] createAnimalObject(String animalNames){
    	
    	String arrAnimals[] = animalNames.split(",");
    	Animal[] animals = new Animal[arrAnimals.length];
    	
    	for(int i=0; i <arrAnimals.length; i++){
    		if ("Bird".equals(arrAnimals[i])){
    			animals[i] = new Bird();
    		}else if("Duck".equals(arrAnimals[i])){
    			animals[i] = new Duck();
    		}else if("Chicken".equals(arrAnimals[i])){
    			animals[i] = new Chicken();
    		}else if("Rooster".equals(arrAnimals[i])){
    			animals[i] = new Rooster();
    		}else if("Parrot".equals(arrAnimals[i])){
    			animals[i] = new Parrot();
    		}else if("Fish".equals(arrAnimals[i])){
    			animals[i] = new Fish();
    		}else if("Shark".equals(arrAnimals[i])){
    			animals[i] = new Shark();
    		}else if("Clownfish".equals(arrAnimals[i])){
    			animals[i] = new Clownfish();
    		}else if("Dolphin".equals(arrAnimals[i])){
    			animals[i] = new Dolphin();
    		}else if("Frog".equals(arrAnimals[i])){
    			animals[i] = new Frog();
    		}else if("Dog".equals(arrAnimals[i])){
    			animals[i] = new Dog();
    		}else if("Butterfly".equals(arrAnimals[i])){
    			animals[i] = new Butterfly();
    		}else if("Cat".equals(arrAnimals[i])){
    			animals[i] = new Cat();
    		}
    		
    	}
    	return animals;
    }
}
