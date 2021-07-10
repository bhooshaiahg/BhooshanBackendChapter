package section3;

import section1.question2.Constants;
import section2.Chicken;

public class RoosterWithoutInheritance{
	
	public static void main(String[] args) {
		Chicken rooster = new Chicken();
		rooster.says(Constants.roosterSingMessage);
	}
}
