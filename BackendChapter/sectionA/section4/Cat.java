package section4;

import section1.question2.AbstractClassAnimal;
import section1.question2.Constants;

public class Cat extends AbstractClassAnimal implements ISound{
	
	@Override
	public boolean sing() {
		// TODO Auto-generated method stub
		//System.out.println(Constants.parrotWithCatSingMessage);
		return false;
	}

	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		return false;
		
	}
	public boolean walk() {
		return true;
	}
	public boolean swim() {
		return false;
	}

	@Override
	public void sound() {
		System.out.println(Constants.parrotWithCatSays);
		
	}
}
