package section2;



import section1.question2.Bird;
import section1.question2.Constants;

public class Chicken extends Bird {
	public boolean fly() {
		return false;
	}
	public static void main(String[] args) {
		
		Chicken chicken = new Chicken();
		chicken.says(Constants.chickenSingMessage);
	}
	
}
