package section2;

import section1.Fish;
import section1.question2.Constants;
import section1.question2.Constants.FishColor;
import section1.question2.Constants.FishSize;

public class SharkFish extends Fish{
	public SharkFish() {
		//TODO
	}
	public SharkFish(FishSize size, FishColor color) {
		super(size, color);
		// TODO Auto-generated constructor stub
	}
	public void eatOtherFish() {
		System.out.println(Constants.sharkEats);
	}
}
