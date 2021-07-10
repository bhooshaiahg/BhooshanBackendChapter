package section2;

import section1.question2.Constants;
import section1.question2.Constants.FishColor;
import section1.question2.Constants.FishSize;

public class TestSection2 {
	public static void main(String[] args) {
		ClownFish clownFish=new ClownFish(FishSize.SMALL,FishColor.ORANGE);
		clownFish.makeJokes();
		SharkFish sharkFish=new SharkFish(FishSize.LARGE,FishColor.GREY);
		sharkFish.eatOtherFish();
	}
}
