package section3;

import section1.question2.AbstractClassAnimal;
import section1.question2.Constants;

public class Dolphin extends AbstractClassAnimal{

	@Override
	public boolean swim() {
		return true;
	}
	@Override
	public boolean sing() {
		return false;
	}
	@Override
	public boolean fly() {
		return false;
		
	}
	public boolean walk() {
		return false;
	}
}
