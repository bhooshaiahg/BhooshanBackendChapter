package section2;

import section1.Fish;
import section1.question2.Constants;
import section1.question2.Constants.FishColor;
import section1.question2.Constants.FishSize;

public class ClownFish extends Fish{
	public ClownFish() {
		//TODO
	}
	public ClownFish(FishSize size, FishColor color) {
		super(size, color);
		// TODO Auto-generated constructor stub
	}
	public void makeJokes() {
		System.out.println(Constants.clownFishJokes);
	}

}
