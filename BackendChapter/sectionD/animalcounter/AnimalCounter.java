package animalcounter;

import section1.ButterFly;
import section1.Fish;
import section1.question2.AbstractClassAnimal;
import section1.question2.Bird;
import section2.Chicken;
import section2.ClownFish;
import section2.Duck;
import section2.SharkFish;
import section3.Dolphin;
import section3.Rooster;
import section4.Cat;
import section4.Dog;
import section4.Frog;
import section4.Parrot;

public class AnimalCounter {
	private int flyCount = 0;
	private int walkCount =0;
	private int singCount =0;
	private int swimCount =0;
	
	public static void main(String[] args) {
		AnimalCounter animalCounter = new AnimalCounter();
		AbstractClassAnimal[] animals = new AbstractClassAnimal[]{ 
				new Bird() ,
				new Duck(), 
				new Chicken(), 
				new Rooster(), 
				new Parrot(), 
				new Fish(), 
				new SharkFish(), 
				new ClownFish(), 
				new Dolphin (), 
				new Frog (), 
				new Dog(), 
				new ButterFly (), 
				new Cat() 
				}; 
		for (AbstractClassAnimal animal : animals) {
			if (animal.fly() ){
				animalCounter.flyCount = animalCounter.flyCount +1;
			}
			if (animal.sing() ){
				animalCounter.singCount = animalCounter.singCount +1;
			}
			if (animal.walk() ){
				animalCounter.walkCount = animalCounter.walkCount +1;
			}
			if (animal.swim() ){
				animalCounter.swimCount = animalCounter.swimCount +1;
			}
		}
		System.out.println("Animals can fly Count:"+animalCounter.flyCount);
		System.out.println("Animals can sing Count:"+animalCounter.singCount);
		System.out.println("Animals can walk Count:"+animalCounter.walkCount);
		System.out.println("Animals can swim Count:"+animalCounter.swimCount);
	}
}
