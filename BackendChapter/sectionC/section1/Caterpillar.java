package section1;

import section1.question2.AbstractClassAnimal;
import section1.question2.Constants;

public class Caterpillar extends AbstractClassAnimal{
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

}
