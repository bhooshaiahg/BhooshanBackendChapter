package section4;

import section1.question2.AbstractClassAnimal;
import section1.question2.Constants;
import section2.Duck;
import section3.Rooster;

public class Parrot extends AbstractClassAnimal {
	@Override
	public boolean sing() {
		return true;
	}

	public boolean swim() {
		return false;
	}

	@Override
	public boolean fly() {
		return true;

	}

	public boolean walk() {
		return false;
	}

	public Parrot() {
		// TODO
	}

	private ISound soundObj;

	public Parrot(ISound sound) {
		this.soundObj = sound;
	}

	public void makeSound() {
		soundObj.sound();
	}

	public static void main(String[] args) {

		Parrot parrotWithDog = new Parrot(new Dog());
		parrotWithDog.makeSound();
		
		Parrot parrotWithCat = new Parrot(new Cat());
		parrotWithCat.makeSound();
		
		Parrot parrotWithRooster = new Parrot(new Rooster());
		parrotWithRooster.makeSound();
		
	}
}
