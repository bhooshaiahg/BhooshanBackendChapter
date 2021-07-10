package section1;

import section1.question2.AbstractClassAnimal;
import section1.question2.Constants.FishColor;
import section1.question2.Constants.FishSize;

public class Fish extends AbstractClassAnimal {
	
	private FishSize size;
	private FishColor color;
	private String swimMessage;
	public Fish() {
		//TODO
	}
	public Fish(FishSize size,FishColor color) {
		this.size = size;
		this.color = color;
	}
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
