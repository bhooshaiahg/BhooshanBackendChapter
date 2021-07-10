package section3;

import section1.question2.Constants;
import section2.Chicken;
import section4.ISound;

public class Rooster extends Chicken implements ISound{
	@Override
	public void sound() {
		System.out.println(Constants.parrotWithRoostereSays);
		
	}
	public static void main(String[] args) {
		Rooster rooster = new Rooster();
		rooster.says(Constants.roosterSingMessage);
	}
}
