package section4;

import section1.question2.AbstractClassAnimal;
import section1.question2.Constants;

public class Dog extends AbstractClassAnimal implements ISound{
	
	@Override
	public boolean sing() {
		return false;
	}
	public boolean swim() {
		return false;
	}

	@Override
	public boolean fly() {
		return false;
		
	}
	public boolean walk() {
		return true;
	}
	@Override
	public void sound() {
		System.out.println(Constants.parrotWithDogSays);
		
	}

}
