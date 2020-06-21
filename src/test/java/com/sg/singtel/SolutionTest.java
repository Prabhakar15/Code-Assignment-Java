package com.sg.singtel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
import com.sg.singtel.rest.helper.SingHelper;
import com.sg.singtel.rest.miscellaneous.AnimalCount;
import com.sg.singtel.rest.utils.enmus.LanguageEnums;
import com.sg.singtel.rest.utils.enmus.SoundEnums;

@SpringBootTest(classes = SolutionTest.class)
@RunWith(SpringRunner.class)
public class SolutionTest {

	@Test
	public void walkTest() {
		//assertEquals(new Animal().canWalk(), "I am walking");
		assertEquals(new Bird().canWalk(), "I am walking");
		assertEquals(new Rooster().canWalk(), "I am walking");
		assertEquals(new Chicken().canWalk(), "I am walking");
		assertEquals(new Duck().canWalk(), "I am walking");
	}

	@Test
	public void flyTest() {
		assertEquals(new Duck().canFly(), "I am flying");
		assertEquals(new Parrot().canFly(), "I am flying");
		assertEquals(new Butterfly().canFly(), "I am flying");
	}

	@Test
	public void cantFlyTest() {
		assertEquals(new Butterfly().cantFly(), "I cant Fly");
	}

	@Test
	public void soundTest() {
		assertEquals(new Bird().callSound(), "I am singing");
		assertEquals(new Duck().callSound(), "Quack, quack");
		assertEquals(new Chicken().callSound(), "Cluck, cluck");

		assertEquals(new Chicken(new SingHelper(SoundEnums.CHICKEN)).callSound(), "Cluck, cluck");
		assertEquals(new Rooster().callSound(), "Cock-a-doodle-doo");
		assertEquals(new Rooster(LanguageEnums.DANISH).callSound(), "kykyliky");
		assertEquals(new Dog(new SingHelper(SoundEnums.DOG)).callSound(), "Woof, woof");
		assertEquals(new Cat(new SingHelper(SoundEnums.CAT)).callSound(), "Meow");

		assertEquals(new Parrot().callSound(), "I am singing");
		assertEquals(new Parrot(new SingHelper(SoundEnums.DOG)).callSound(), "Woof, woof");
		assertEquals(new Parrot(new SingHelper(SoundEnums.CAT)).callSound(), "Meow");
		assertEquals(new Parrot(new SingHelper(SoundEnums.ROOSTER)).callSound(), "Cock-a-doodle-doo");

		assertEquals(new Butterfly().callSound(), "caterpillar");
		assertEquals(new Butterfly().transform(), "");
	}

	@Test
	public void bodyColor() {
		assertEquals(new Fish().bodyColor(), null);
		assertEquals(new Shark().bodyColor(), "grey");
		assertEquals(new Clownfish().bodyColor(), "orange");
	}

	@Test
	public void bodySize() {
		assertEquals(new Fish().bodySize(), null);
		assertEquals(new Shark().bodySize(), "large");
		assertEquals(new Clownfish().bodySize(), "small");
	}

	@Test
	public void extraFishTest() {
		assertEquals(new Shark().canEat(), "I eat fish");
		assertEquals(new Clownfish().makeJoke(), "I make jokes");
	}

	@Test
	public void swim() {
		assertEquals(new Duck().canSwim(), "I am swimming");
		assertEquals(new Fish().canSwim(), "I am swimming");
		assertEquals(new Dolphin().canSwim(), "I am swimming");
	}

	@Test
	public void CountingAnimals() {

		Animal[] animals = new Animal[] { 
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
				new Cat() };
		AnimalCount animalCount = new AnimalCount(animals);

		assertEquals(animalCount.getFlyingAnimal(), 6);
		assertEquals(animalCount.getWalkingAnimal(), 9);
		assertEquals(animalCount.getSpeakingAnimal(), 9);
		assertEquals(animalCount.getSwimingAnimal(), 6);

	}
}